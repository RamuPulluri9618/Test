package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Student {
	
	int id;
	@Test(priority=1)
	void getStudentDetails() {
		
		when()
			 .get("http://localhost:3000/students").
		then()
			.statusCode(200)
			.log().all();
	}
	
	@Test(priority=2)
	void createStudentDetail() {
		
		HashMap data= new HashMap();
		data.put("name", "raghu");
		data.put("location", "america");
		
		id=given()
				.contentType("application/json").body(data).
		when()
			 .post("http://localhost:3000/students")
			 .jsonPath().getInt("id");
		
		System.out.println("id atcreateStudentDetail "+id);
		
	}
	
	@Test(priority=3, dependsOnMethods="createStudentDetail")
	void updateStudentDetail() {
		
		HashMap data= new HashMap();
		data.put("name", "ramesh");
		data.put("location", "america");
		
		given()
				.contentType("application/json").body(data).
		when()
				.post("http://localhost:3000/students/"+id).
		then()
			.statusCode(200)
			.log().all();
				
		
	}
	
	@Test(priority=4)
	void deleteStudentDetail() {
		
		
		when()
				.delete("http://localhost:3000/students/"+id).
		then()
			.statusCode(200)
			.log().all();
				
		
	}
	
	
	

}

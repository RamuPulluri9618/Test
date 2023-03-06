package day2;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

/*
 Ways to create post request
 
 1.Post request body using HashMap
 2.Post request body using Org.Json
 3.Post request body using POJO Class Plain Old Java Object
 4.Post request body using external Json data
 */

public class DiffwaysToCreatePostRequest {
	
	
	//@Test
	void testPostUsingHashMap() {
	
		HashMap data =new HashMap();
		data.put("name", "raghu");
		data.put("location", "america");
		data.put("phone", "789456");
		String[] coursesarr= {"Python","REACT"};
		
		
		data.put("courses", coursesarr);
		
		System.out.println(data.entrySet());
		
		given()
				.contentType("application/json").body(data).
		when()
			.post("http://localhost:3000/students").
		then()
			.statusCode(201)
			.body("name", equalTo("raghu"))
			.body("location", equalTo("america"))
			.body("phone", equalTo("789456"))
			.body("courses[0]",equalTo("Python"))
			.header("Content-Type", "application/json; charset=utf-8")
			.log().all();
	}
	
	//@Test(priority=1)
	void testPostUsingJsonLibrary() {
		
		JSONObject data= new JSONObject();
		
		data.put("name", "raghu");
		data.put("location", "america");
		data.put("phone", "789456");
		
		String[] coursesarr= {"Python","REACT"};
		
		data.put("courses", coursesarr);
		
		
		given()
				.contentType("application/json").body(data.toString()).
		when()
			.post("http://localhost:3000/students").
		then()
			.statusCode(201)
			.body("name", equalTo("raghu"))
			.body("location", equalTo("america"))
			.body("phone", equalTo("789456"))
			.body("courses[0]",equalTo("Python"))
			.header("Content-Type", "application/json; charset=utf-8")
			.log().all();
	}
	//Post request body using POJO Class 
	//@Test(priority=1)
		void testPostUsingPOJOClass() {
			
			POJO_PostRequest pojo= new POJO_PostRequest();
			
			pojo.setName("raghu");
			pojo.setLocation("america");
			pojo.setPhone("789456");
			
			String[] coursesarr= {"Python","REACT"};
			
			pojo.setCourses(coursesarr);
			
			
			given()
					.contentType("application/json").body(pojo).
			when()
				.post("http://localhost:3000/students").
			then()
				.statusCode(201)
				.body("name", equalTo("raghu"))
				.body("location", equalTo("america"))
				.body("phone", equalTo("789456"))
				.body("courses[0]",equalTo("Python"))
				.header("Content-Type", "application/json; charset=utf-8")
				.log().all();
		}
	
	//Post request body using POJO Class 
	//@Test(priority=1)
		void testPostUsingexternalJson() throws Exception {
			
			File fi= new File(".\\body.json");
			
			FileReader fr =new FileReader(fi);
			
			JSONTokener jk= new JSONTokener(fr);
			
			JSONObject data= new JSONObject(jk);
			
			
			
			given()
					.contentType("application/json").body(data.toString()).
			when()
				.post("http://localhost:3000/students").
			then()
				.statusCode(201)
				.body("name", equalTo("rahul"))
				.body("location", equalTo("india"))
				.body("phone", equalTo("96185"))
				.body("courses[0]",equalTo("php"))
				.header("Content-Type", "application/json; charset=utf-8")
				.log().all();
		}

	
	
	@Test(priority=2)
	void deleteStudentDetail() {
		
		when()
				.delete("http://localhost:3000/students/9").
		then()
				.statusCode(200)
				.log().all();
		
		
		when()
			.delete("http://localhost:3000/students/10").
		then()
			.statusCode(200)
			.log().all();
				
		
	}
	
	
}

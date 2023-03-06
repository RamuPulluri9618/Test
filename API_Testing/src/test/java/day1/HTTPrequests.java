package day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
/*
 * Given() - content type,set cookies,add auth,add param, set header info etc...
 * When() - get(), post(), put()s, delete().
 * Then() - validate status code, extract response,extract header cookies and response body....
 */

public class HTTPrequests {
	
	int id;
	@Test(priority=1)
	void getUser() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
	}
	
	@Test(priority=2)
	void createUser() {
		
		HashMap hmap= new HashMap();
		hmap.put("name", "Mic");
		hmap.put("job", "Carpenter");
		
		System.out.println(hmap.entrySet());
		
		id=
		given()
		.contentType("application/json").body(hmap)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		System.out.println("Id is"+id);
		
//		.then().statusCode(201)
//		.log().all();
		
	}
	
	
	//@Test(priority=3,dependsOnMethods= {"createUser"})
	void updateUser() {
		
		System.out.println("Id updateUser"+id);
		
		HashMap hmap= new HashMap();
		hmap.put("name", "Micy");
		hmap.put("job", "Driver");
		
		System.out.println(hmap.entrySet());
		
		given()
		.contentType("application/json")
		.body(hmap)
		.when()
		.put("https://reqres.in/api/users"+id)
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	@Test(priority=4,dependsOnMethods= {"createUser"})
	void deleteRequest() {
		
		when()
			.delete("https://reqres.in/api/users"+id)
		.then()
			.statusCode(204)
			.log().all();
	}

}

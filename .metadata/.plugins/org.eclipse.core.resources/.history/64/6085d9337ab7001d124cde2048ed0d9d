package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesandHeaders {

	@Test(priority=1)
	void testCookies() {
		
		given()
		
		.when()
			.get("https://google.com/")
			
		.then()
			//.cookie("AEC","ARSKqsLLyhMQZuWVGf5TY0akiU2eTpbbN9jIJ9oLMRrIfhgYh-uYzzOCB8g")
			.log().all();
	}
	
	@Test(priority=2)
	void getCookiesInfo() {
		
		Response res=when()
			.get("https://google.com/");
		
//		String cookies_value=res.getCookie("AEC");
//		
//		System.out.println("Value of cookies is"+cookies_value);
		
		Map<String,String> cookies=res.getCookies();
		
		System.out.println("Value of cookies is"+cookies.entrySet());
		
		for(String key:cookies.keySet()) {
			
			String cookie_value=res.getCookie(key);
			System.out.println(key+""+cookie_value);
			
		}
	}
}

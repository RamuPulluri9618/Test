package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeaderValidation {

	
	@Test(priority=1)
	void testHeaders() {
		
		given()
		
		.when()
			.get("https://google.com/")
			
		.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1")
			.header("Content-Encoding", "gzip")
			.header("Server", "gws");
				
	}
	
	@Test(priority=2)
	void getHeaders() {
		
		Response res=
		
		when()
			.get("https://google.com/");
		
		String header=res.getHeader("Content-Type");
		
		System.out.println("get header value"+header);
		
		Headers myheaders=res.headers();
		
		for(Header hd:myheaders) {
			
			System.out.println(hd.getName()+hd.getValue());
			
		}
			
		
	}
}

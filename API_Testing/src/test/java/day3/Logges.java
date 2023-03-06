package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Logges {

	
	@Test(priority=1)
	void testHeaders() {
		
		given()
		
		.when()
			.get("https://google.com/")
			
		.then()
			//.log().body();
		.log().cookies();
		//.log().headers();
	}
}

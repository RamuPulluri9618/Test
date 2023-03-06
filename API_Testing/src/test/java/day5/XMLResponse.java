package day5;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class XMLResponse {

	
	//@Test()
	void testXMLResponse() {
		
		//Approach 1
		/*
		 * given()
		 * 
		 * .when().get("http://restapi.adequateshop.com/api/Traveler?page=1")
		 * 
		 * .then() .statusCode(200) .header("Content-Type",
		 * "application/xml; charset=utf-8") .body("TravelerinformationResponse.page",
		 * equalTo("1"))
		 * .body("TravelerinformationResponse.travelers.Travelerinformation[0].name",
		 * equalTo("Developer")) .log().all();
		 */
		
		
		//Approach2
		
		Response res= given()
				.when().get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");
		
			String name=res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name").toString();
			
			Assert.assertEquals(name, "Developer");
		
		
	}
	
	
	@Test
	
	void testXMLResponseBody() {
		
		Response res= given()
				.when().get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlobj= new XmlPath(res.asString());
		
		
		List<String> travler=xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation");
		
		System.out.println("travler total number"+travler.size());
		
		Assert.assertEquals(travler.size(), 10);
		
		List<String> travlername=xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
		boolean status = false;
		for(String ab:travlername) {
			
			System.out.println("travlername are "+ab);
			
			if(ab.matches("Developer")) {
				
				status=true;
				break;
				
			}
			
		}
		
		Assert.assertEquals(true, status); 
		
		
	}
}

 package day4;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingJSONResponseData {

	//@Test(priority=1)
	void testJsonResponse() {
		
		/* given()
		 		//.contentType("Content-Type.JSON")
		 .when()
		 	.get("http://localhost:3000/store/")
		 
		 .then()
		 		.statusCode(200)
		 		.header("Content-Type", "application/json; charset=utf-8")
		 		.body("book[3].title", equalTo("The Lord of Rings"))
		 		.body("book[1].author", equalTo("Even Waugh"))
		 		.log().all();
		 
		 */
		
		Response res=when()
			.get("http://localhost:3000/store/");
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.getContentType(),"application/json; charset=utf-8");
		
		String bookname=res.jsonPath().get("book[3].title").toString();
		System.out.println("Book name"+bookname);
		
		Assert.assertEquals(bookname, "The Lord of Rings");
		
		
	}
	
	//@Test(priority=2)
	void testJsonBodyResponse() {
		
		Response res=
				//given()
				//.contentType(ContentType.JSON).
				when()
			.get("http://localhost:3000/store");
		
		/*
		 * Assert.assertEquals(res.getStatusCode(),200);
		 * Assert.assertEquals(res.getContentType(),"application/json; charset=utf-8");
		 * 
		 * String bookname=res.jsonPath().get("book[3].title").toString();
		 * System.out.println("Book name"+bookname);
		 * 
		 * Assert.assertEquals(bookname, "The Lord of Rings"); 
		 */
		
		JSONObject data= new JSONObject(res.asString());//convertring Json object to string
		
		boolean status=false;
		for(int i=0;i<data.getJSONArray("book").length();i++){//get json array from data(JSONObject)
			
			String booktitle=data.getJSONArray("book").getJSONObject(i).get("title").toString();
			
			//System.out.println("Book title is"+booktitle);
			
			if(booktitle.equals("The Lord of Rings")) {
				
				status=true;
				break;
			}
			
			
		}
		Assert.assertEquals(true, status);
		
		
		
	}
	
	@Test(priority=3)
	void gettotalprice() {
		
		Response res=
				when()
			.get("http://localhost:3000/store");
		
		JSONObject data= new JSONObject(res.asString());
		
		float sum=0;
		
		for(int i=0;i<data.getJSONArray("book").length();i++) {
			
			String pricee=data.getJSONArray("book").getJSONObject(i).get("price").toString();
			
			float pricce= Float.parseFloat(pricee);
			
			sum= sum+pricce;
			
			
		}
		
		System.out.println("sum of total prices is :"+sum);
		Assert.assertEquals(sum, 526.0);
		
	}

}

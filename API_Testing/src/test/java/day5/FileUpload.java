package day5;
//file upload use post request.

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class FileUpload {

	
	//@Test()
	
	void singleFileUpload() {
		
		File file1 = new File("C:\\Users\\RAMU PULLURI\\Desktop\\Automation\\API_Testing\\Test1.txt");
		File file2 = new File("C:\\Users\\RAMU PULLURI\\Desktop\\Automation\\API_Testing\\Test2.txt");
		
		File[] fileuploads= {file1,file2};
		
		
		
		given()
			.multiPart("files",fileuploads[0])
			.multiPart("files",fileuploads[1])
			//.multiPart("files",file2)
			.contentType("multipart/form-data")
		
		.when()
			.post("http://localhost:8080/uploadMultipleFiles")
		
		.then()
			.statusCode(200)
			.body("[0].fileName", equalTo("Test1.txt"))
			.log().all();
		
		
	}
	
	@Test()
	
	void getvalueFileUpload() {
		
		given().
	
		when()
		.get("http://localhost:8080/downloadFile/Test2.txt")
		
		.then()
			.statusCode(200)
			.log().body();
		
		
		
	}
}

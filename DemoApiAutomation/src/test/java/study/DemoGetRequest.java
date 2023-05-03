package study;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoGetRequest {

	@Test
	public void checkGet() {
		
	Response resp = RestAssured.get("http://localhost:3000/comments");
	int statuscode	= resp.statusCode();
	System.out.println("statuscode is :"+ statuscode);
	
	 long Time = resp.time();
	 System.out.println(" Respnse time in MS :"+ Time);
	 
	 long TimeInsec = resp.timeIn(TimeUnit.SECONDS);
	 System.out.println(" Respnse time in Sec :"+ TimeInsec);
	 
	  String contentType = resp.contentType();
	  System.out.println("content Type is:"+ contentType);
	
	  String Body = resp.asString();
	  System.out.println("Body  is:"+" "+ Body);
	  
	}
}

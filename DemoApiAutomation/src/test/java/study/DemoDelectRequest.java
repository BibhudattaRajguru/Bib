package study;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoDelectRequest {
	@Test
	public void checkDelect() {
		
	Response resp = RestAssured.delete("http://localhost:3000/comments");
	resp.then().log().all();
	
 }
}
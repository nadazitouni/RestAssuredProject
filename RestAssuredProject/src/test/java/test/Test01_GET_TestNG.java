package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Test01_GET_TestNG {


	//test status Code and display information about rest api
	@Test
	void test_01() {
		
		Response response = get("http://localhost:8080/mytest");
		
		System.out.println("Random value in Test01 is "+response.asString());
		System.out.println("Random value in Test01 is "+response.getBody().asString());
		System.out.println("Status code in Test01 is "+response.getStatusCode());
		System.out.println("Status Line in Test01 is "+response.getStatusLine());
		System.out.println("Header in Test01 is "+response.getHeader("content-type"));
		System.out.println("Time in Test01 is "+response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	} 

	// Test if random value is between 10 and 50
	
	@Test
	void test_02 () {
		
		Response response = get("http://localhost:8080/mytest");
		boolean b= true;
		String randomS=response.getBody().asString();
		int random =Integer.parseInt(randomS);  
		System.out.println("Random value in Test02 is" +random);
		
		if ((random<10) || (random>50))
			
		{
			b=false;
		}
		
		Assert.assertEquals(b, true);
	}
	
	// Test of condition correct or not correct
	@Test
	void test_03 () {
		
		Response response = get("http://localhost:8080/mytest");
		
		String randomS=response.getBody().asString();
		int random =Integer.parseInt(randomS);  
		System.out.println("Random value in Test03 is" +random);
		
		if (random>15)
			
		{
			System.out.println("Not Correct");
		}
		else
		{
			System.out.println("Not Correct");
		}
		
	}
		
		
		
}

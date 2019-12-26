package getweather;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Getweatherdata {
	
	@Test
	public void getresponsecode() {
		//RestAssured.baseURI = "http://localhost:9876"; 
		String responseweather = RestAssured
			.get("https://api.openweathermap.org/data/2.5/weather?q=Bangalore,in&APPID=a42473fb1ff37399e73b498845cfb18c")
			.asString();
		System.out.println(responseweather);
		
	
		
	}

}

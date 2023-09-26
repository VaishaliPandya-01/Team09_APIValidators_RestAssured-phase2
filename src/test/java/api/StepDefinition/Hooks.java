package api.StepDefinition;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import api.utilities.RestUtils;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

public class Hooks extends RestUtils{

	@Before("@Create_Program")
	public static void beforeAll() 
	{
		try {	    

			PrintStream stream = new PrintStream(new FileOutputStream(path.getString("RestAssureLogPath") + "restAssured_log.txt"));
			RestAssured.filters(RequestLoggingFilter.logRequestTo(stream));
			RestAssured.filters(ResponseLoggingFilter.logResponseTo(stream));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}

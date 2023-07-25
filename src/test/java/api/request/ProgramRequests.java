package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProgramRequests extends RestUtils{

	//Post Request
	public static Response PostRequest(ProgramPayload payload) throws FileNotFoundException {

		PrintStream logs = new PrintStream(new FileOutputStream("Loggs/ProgramPostLog.txt"));
		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload).
				filter(RequestLoggingFilter.logRequestTo(logs)).
				filter(ResponseLoggingFilter.logResponseTo(logs)).
				when().post(routes.getString("Program_Post_URL"));

		return response;
	}

	//Delete Request
	public static Response DeletRequest(){

		response =when().
				delete(routes.getString("Program_Delete_URL")+ProgramPayload.getProgramName());

		return response;
	}

	//Delete Request
	public static Response PutRequest() {

		response = when().
				put(routes.getString("Program_Put_URL")+ProgramPayload.getProgramName());

		return response;
	}
}

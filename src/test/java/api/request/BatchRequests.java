package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import api.payload.BatchPayload;
import api.utilities.RestUtils;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BatchRequests extends RestUtils{

	//Post Request
	public static Response PostRequest(BatchPayload payload) throws FileNotFoundException {
		
		PrintStream logs = new PrintStream(new FileOutputStream("Loggs/BatchPostLog.txt"));
		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload).
				filter(RequestLoggingFilter.logRequestTo(logs)).
				filter(ResponseLoggingFilter.logResponseTo(logs)).
				when().post(routes.getString("Batch_Post_URL"));

		return response;
	}
	
	//Delete Request
		public static Response DeletRequest() {

			response = when().
					delete(routes.getString("Batch_Delete_URL")+BatchPayload.getBatchId());

			return response;
		}


}

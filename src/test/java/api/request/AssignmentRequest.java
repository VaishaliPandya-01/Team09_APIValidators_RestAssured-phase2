package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.FileOutputStream;
import java.io.PrintStream;

import api.payload.AssignmentPayload;
import api.utilities.RestUtils;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssignmentRequest extends RestUtils{


	//Post Request
	public static Response PostRequest(AssignmentPayload payload) {

		try {

			response = given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload).
					when().post(routes.getString("Assignment_Post_URL"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}



	//Put Request
	public static Response PutRequest(AssignmentPayload payload) {

		try {

			PrintStream logs = new PrintStream(new FileOutputStream("Loggs/AssignmentPutLog.txt"));
			response = given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload).
					filter(RequestLoggingFilter.logRequestTo(logs)).
					filter(ResponseLoggingFilter.logResponseTo(logs)).
					when().put(routes.getString("Assignment_Put_URL")+AssignmentPayload.getAssignmentId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}



	//Delete Request
	public static Response DeletRequest() {

		response = when().
				delete(routes.getString("Assignment_Delete_URL")+AssignmentPayload.getAssignmentId());

		return response;
	}

}

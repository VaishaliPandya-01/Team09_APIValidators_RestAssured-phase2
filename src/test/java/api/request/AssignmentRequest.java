package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.AssignmentPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssignmentRequest extends RestUtils{
	

	//Post Request
	public static Response PostRequest(AssignmentPayload payload) {

		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload).
				when().post(routes.getString("Assignment_Post_URL"));

		return response;
	}
	

	//Put Request
	public static Response PutRequest(AssignmentPayload payload) {

		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload).
				when().put(routes.getString("Assignment_Put_URL")+AssignmentPayload.getAssignmentId());

		return response;
	}
	

	//Delete Request
	public static Response DeletRequest() {

		response = when().
				delete(routes.getString("Assignment_Delete_URL")+AssignmentPayload.getAssignmentId());

		return response;
	}

}

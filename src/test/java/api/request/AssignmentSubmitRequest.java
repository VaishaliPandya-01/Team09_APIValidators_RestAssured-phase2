package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.AssignmentSubmitPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssignmentSubmitRequest extends RestUtils{	


	//Post Request
	public static Response PostRequest(AssignmentSubmitPayload payload) {

		try {
			response = given().
					contentType(ContentType.JSON).
					body(payload).
					when().post(routes.getString("AssignmentSubmit_Post_URL"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	//Delete Request
	public static Response DeletRequest() {

		response = when().
				delete(routes.getString("AssignmentSubmit_Delete_URL")+AssignmentSubmitPayload.getSubmissionId());

		return response;
	}

}

package api.request;

import static io.restassured.RestAssured.*;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProgramRequests extends RestUtils {

	// Post Request
	public static Response PostRequest(ProgramPayload payload) {
		// storing the response when-> given() (body and pre conditions) and when()
		// -containing endpoints and request type

		response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).log().all().when()
				.post(routes.getString("Program_Post_URL"));

		// response.then().log().all();
		System.out.println("PostRequest : " + response);

		return response;
	}

	// Delete Request
	public static Response DeletRequest() {

		response = when().delete(routes.getString("Program_Delete_URL") + ProgramPayload.getProgramName());

		return response;
	}

	// UpdateRequest
	public static Response PutRequest() {

		response = when().put(routes.getString("Program_Put_URL") + ProgramPayload.getProgramName());

		return response;
	}

}

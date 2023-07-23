package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.UserPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserRequest extends RestUtils{

	//Post Request
	public static Response PostRequest(UserPayload payload) {

		response = given().
				contentType(ContentType.JSON).
				body(payload).
				when().post(routes.getString("User_Post_URL"));

		return response;
	}
	
	//Delete Request
			public static Response DeletRequest() {

				response = when().
						delete(routes.getString("User_Delete_URL")+UserPayload.getUserId());

				return response;
			}

}

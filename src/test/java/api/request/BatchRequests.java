package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.BatchPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BatchRequests extends RestUtils{

	//Post Request
	public static Response PostRequest(BatchPayload payload) {
		
		try {
		
		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload).
				when().post(routes.getString("Batch_Post_URL"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	//Delete Request
		public static Response DeletRequest() {

			response = when().
					delete(routes.getString("Batch_Delete_URL")+BatchPayload.getBatchId());

			return response;
		}


}

package api.request;


import static io.restassured.RestAssured.*;
import api.utilities.RestUtils;
import api.payload.BatchPayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BatchRequests extends RestUtils{
	
	//postBatch
	
			public static Response PostRequest(BatchPayload payload) {

			response = given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload).log().all().
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

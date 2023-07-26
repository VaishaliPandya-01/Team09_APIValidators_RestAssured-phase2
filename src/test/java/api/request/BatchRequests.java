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

		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload).
				when().post(routes.getString("Batch_Post_URL"));

		return response;
	}
	

	
	// Get all batch
		public static Response GetRequest () {
			 response = when().get(routes.getString("Batch_GetAll_URL"));
			return response;
		}
		
		//Get Batch by ID
		public static Response GetBatchByIDRequest () {
			response = when().get(routes.getString("Batch_GetbyId_URL")+BatchPayload.getBatchId());
			
			return response;
		}
		
		//Get Batch by Name
		public static Response GetBatchByNameRequest () {
			 response = when().get(routes.getString("Batch_GetbyName_URL")+BatchPayload.getBatchName());
			return response;
		}
		//Get Batch by ProgId
		public static Response GetBatchByProgIDRequest () {
			 response = when().get(routes.getString("Batch_GetBatchByProgramID")+BatchPayload.getProgramId());
			return response;
		}
		
		//Update by ID
		public static Response UpdateBatchByIDRequest (BatchPayload updateBatch) {		
			response = given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(updateBatch).
					when().put(routes.getString("Batch_UpdateByBatchID")+BatchPayload.getBatchId());
			return response;
		}
	
	//Delete Request
		public static Response DeletRequest() {
             System.out.println("sudhabatchid"+BatchPayload.getBatchId());
			response = when().
					delete(routes.getString("Batch_Delete_URL")+BatchPayload.getBatchId());

			return response;
		}

		

}



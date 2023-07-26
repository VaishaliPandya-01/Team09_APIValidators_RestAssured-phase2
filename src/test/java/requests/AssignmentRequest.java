package requests;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import payload.AssignmentPayload;
import utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class AssignmentRequest extends RestUtils{
	
	
	//Post Request
		public static Response PostRequest(AssignmentPayload payload)  {

			

				response = given().contentType(ContentType.JSON).
						accept(ContentType.JSON).
						body(payload).log().all().when()
						.post(routes.getString("Assignment_Post_URL"));
				return response;
			}
			
		
		
		//Delete Request
		public static Response DeletRequest() {

			response = when().
					delete(routes.getString("Assignment_Delete_URL")+AssignmentPayload.getAssignmentId());

			return response;
		}
		//Delete Request
				public static Response DeletRequestforAss2() {

					response = when().
							delete(routes.getString("Assignment_Delete_URL")+AssignmentPayload.getAssignmentId());

					return response;
				}
		//Put Request
		
		public static Response PutRequest(AssignmentPayload payload) {
			//AssignmentPayload.setAssignmentDescription("SQL Assignment");
			
			response =given().
					contentType(ContentType.JSON).
					
					body(payload).
					when().
					put(routes.getString("Assignment_GetAllAssignments_URL")+AssignmentPayload.getAssignmentId());
			response.then().log().all();
			 return response;
		}
		// Get by AssignmentId
		public static Response GetRequest() {
			response = when().
					get( routes.getString("Assignment_GetAllAssignments_URL")+AssignmentPayload.getAssignmentId());
		//	response.then().log().all();
					return response;
					
		}
		//Get assignment for Batch
		
		public static Response GetRequestBatch() {
			response = when().
					get( routes.getString("Assignment_GetAssignmentforBatch_URL")+BatchPayload.getBatchId());
					return response;
		}
		
		// Get By BatchId with no assignment
		
		public static Response GetRequestBatch1() {
			response = when().
					get( routes.getString("Assignment_GetAssignmentforBatch_URL")+6580);
					return response;
		}


}

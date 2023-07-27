package api.request;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ProgramRequests extends RestUtils{


	// Post Request
	public static Response PostRequest(ProgramPayload payload) {		

		try {
			response = given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload)
					.when().post(routes.getString("Program_Post_URL"));
		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	
	// UpdateRequestwithValidProgramName
	public static Response UpdateByProgramName(ProgramPayload payload) {

		try {

			response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON).body(payload)
					.when().put(routes.getString("Program_PutbyName_URL")+ProgramPayload.getProgramName());

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}

	// Update Request with Valid ProgramID
	public static Response UpdateByProgramID(ProgramPayload payload) {

		try {

			response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload)
					.when().put(routes.getString("Program_PutbyID_URL")+ProgramPayload.getProgramId());

		}catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	// GetALLRequest - all programs
	public static Response GetAllProgramRequest() {

		try {
			response = given()
					.when().get(routes.getString("Program_GetAll_URL"));

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}



	// GetRequest By ValidProgram ID
	public static Response GetByProgramID() {
		System.out.println("ProgramID is "+ProgramPayload.getProgramId());

		try {

			response = given()
					.when().get(routes.getString("Program_GetbyID_URL")+ProgramPayload.getProgramId());

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}


	//Delete Request with program name
	public static Response DeletebyprogramName() {

		try {

			response = when().
					delete(routes.getString("Program_DeletebyName_URL")+ProgramPayload.getProgramName());

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	// DeleteRequestwithValidProgramID
	public static Response DeleteByProgrambyID()	{

		System.out.println("Program ID is "+ProgramPayload.getProgramId());
		try { 

			response = when().
					delete(routes.getString("Program_DeletebyID_URL")+ProgramPayload.getProgramId());

		}catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	//
	//	//Put Request with program name
	//	public static Response PutRequest() {
	//
	//		try {
	//			
	//			response = when().
	//					put(routes.getString("Program_Put_URL")+ProgramPayload.getProgramName());
	//
	//		}catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return response;
	//	}





	//	// DeleteRequestwithInValidProgramID
	//	public static Response DeleteByInValidProgramID(ProgramPayload payload) {
	//
	//		System.out.println("Program ID is "+ProgramPayload.getProgramId());
	//		response = when().delete(routes.getString("Program_DeletebyinvalidID_URL")+ProgramPayload.getProgramId());
	//
	//		return response;
	//	}


	//	// PostRequest_withExistingFields
	//	public static Response PostRequestExistingValues(ProgramPayload payload) {
	//
	//		response = given().contentType(ContentType.JSON).
	//				accept(ContentType.JSON).body(payload)
	//				.when().post(routes.getString("Program_Post_URL"));
	//
	//		return response;
	//	}

	//	// PostRequest_withMissingMandatoryFields
	//	public static Response PostRequestMissingMandatoryFields(ProgramPayload payload) {
	//
	//		response = given().contentType(ContentType.JSON).
	//				accept(ContentType.JSON).body(payload)
	//				.when().post(routes.getString("Program_Post_URL"));
	//		return response;
	//	}


	//	// Update Request with ValidID and Missing Mandatory Fields
	//	public static Response UpdateByValidIDwithMissingFields(ProgramPayload payload) {
	//
	//		try {
	//			
	//		response = given().contentType(ContentType.JSON).
	//				accept(ContentType.JSON).body(payload).body(payload)
	//				.when().put(routes.getString("Program_PutbyID_URL")+ProgramPayload.getProgramId());
	//
	//		}catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		
	//		return response;
	//	}


	//	// Update Request with valid ProgramName and Missing Mandatory Fields
	//	public static Response UpdateByValidProgramNamewithMissingFields(ProgramPayload payload) {
	//
	//		response = given().contentType(ContentType.JSON).
	//				accept(ContentType.JSON).body(payload)
	//				.when().put(routes.getString("Program_PutbyName_URL")+ProgramPayload.getProgramName());
	//
	//		return response;
	//	}


	//	// GetRequest with InValid ProgramID
	//	public static Response GetByInValidProgramID() {
	//
	//		response = given().get(routes.getString("Program_GetbyinvalID_URL"));
	//
	//		return response;
	//	}
	//
	//
	//	// Update Request with InValid ProgramID
	//	public static Response UpdateByInValidProgramID(ProgramPayload payload) {
	//
	//		response = given().contentType(ContentType.JSON).
	//				accept(ContentType.JSON).body(payload)
	//				.when().put(routes.getString("Program_PutbyinvalID_URL")+ProgramPayload.getProgramId());
	//
	//		return response;
	//	}
	//
	//	// Update Request with InValid ProgramName
	//	public static Response UpdateByInValidProgramName(ProgramPayload payload) {
	//
	//		response = given().contentType(ContentType.JSON).
	//				accept(ContentType.JSON).body(payload)
	//				.when().put(routes.getString("Program_PutbyinvalidName_URL")+ProgramPayload.getProgramName());
	//
	//		return response;
	//	}

	//	// Delete Request with Valid ProgramName
	//	public static Response DeleteByValidProgramName()	{
	//
	//		System.out.println("Program Name is "+ProgramPayload.getProgramName());
	//try {
	//	
	//		response = when().
	//				delete(routes.getString("Program_DeletebyvalidName_URL")+ProgramPayload.getProgramName());
	//
	//}catch (Exception e) {
	//	e.printStackTrace();
	//}
	//		return response;
	//	}

	//	// Delete Request with InValid ProgrameName
	//	public static Response DeleteByInValidProgramName(ProgramPayload payload) {
	//
	//		System.out.println("Program Name is "+ProgramPayload.getProgramName());
	//
	//		response = when().delete(routes.getString("Program_DeletebyinvalidName_URL")+ProgramPayload.getProgramName());
	//
	//		return response;
	//	}
}

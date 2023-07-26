package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import api.payload.ProgramPayload;
import api.requestbody.ProgramBody;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ProgramRequests extends RestUtils {

	// PostRequest_withNon-ExistingFields
	public static Response PostRequest(ProgramPayload payload) {
		
		response = given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				body(payload)
				.when().post(routes.getString("Program_Post_URL"));
		
		return response;
	}
	
	// GetALLRequest - all programs
	public static Response GetAllProgramRequest(ProgramPayload payload) {
			
		response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON)
					.when().get(routes.getString("Program_GetAll_URL"));
		return response;
		
	}
	
	// Update Request with Valid ProgramID
	public static Response UpdateByValidProgramID(ProgramPayload payload) {
			
		response = given().contentType(ContentType.JSON).
						accept(ContentType.JSON).body(payload)
				    	.when().put(routes.getString("Program_PutbyID_URL")+ProgramPayload.getProgramId());
				
		return response;
	}
		
	// GetRequest By ValidProgram ID
	public static Response GetByValidProgramID(ProgramPayload payload) {
		System.out.println("ProgramID is "+ProgramPayload.getProgramId());
				   
		response = given().contentType(ContentType.JSON).
						accept(ContentType.JSON)
			    		.when().get(routes.getString("Program_GetbyID_URL")+ProgramPayload.getProgramId());
				
		return response;
	}
		
	// DeleteRequestwithValidProgramID
	public static Response DeleteByValidProgramID(ProgramPayload payload)	{
				
		System.out.println("Program ID is "+ProgramPayload.getProgramId());
		response = when().delete(routes.getString("Program_DeletebyvalidID_URL")+ProgramPayload.getProgramId());
				
		return response;
	}
			
	// DeleteRequestwithInValidProgramID
	 public static Response DeleteByInValidProgramID(ProgramPayload payload) {
	    	
	    System.out.println("Program ID is "+ProgramPayload.getProgramId());
		response = when().delete(routes.getString("Program_DeletebyinvalidID_URL")+ProgramPayload.getProgramId());
			
		return response;
	 }
	 
	// UpdateRequestwithValidProgramName
	 public static Response UpdateByValidProgramName(ProgramPayload payload) {
			
		response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON).body(payload)
			    	.when().put(routes.getString("Program_PutbyName_URL")+ProgramPayload.getProgramName());
			
		return response;
			
	}
		
		
	// PostRequest_withExistingFields
	 public static Response PostRequestExistingValues(ProgramPayload payload) {
		
		response = given().contentType(ContentType.JSON).
				accept(ContentType.JSON).body(payload)
				   .when().post(routes.getString("Program_Post_URL"));
		
		return response;
	}
	
	// PostRequest_withMissingMandatoryFields
	 public static Response PostRequestMissingMandatoryFields(ProgramPayload payload) {
		
		response = given().contentType(ContentType.JSON).
				accept(ContentType.JSON).body(payload)
				   .when().post(routes.getString("Program_Post_URL"));
		return response;
	}
	
	
	// Update Request with ValidID and Missing Mandatory Fields
		public static Response UpdateByValidIDwithMissingFields(ProgramPayload payload) {
			
		response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON).body(payload).body(payload)
			    	.when().put(routes.getString("Program_PutbyID_URL")+ProgramPayload.getProgramId());
			
		return response;
	}
		
	
	// Update Request with valid ProgramName and Missing Mandatory Fields
	public static Response UpdateByValidProgramNamewithMissingFields(ProgramPayload payload) {
		
		response = given().contentType(ContentType.JSON).
				accept(ContentType.JSON).body(payload)
		    	.when().put(routes.getString("Program_PutbyName_URL")+ProgramPayload.getProgramName());
		
		return response;
	}
		
	
   // GetRequest with InValid ProgramID
  		public static Response GetByInValidProgramID(ProgramPayload payload) {
  			
  			
  			
		response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON)
		    		.when().get(routes.getString("Program_GetbyinvalID_URL"));
			
		return response;
  	}
  		
  	
  	// Update Request with InValid ProgramID
  		public static Response UpdateByInValidProgramID(ProgramPayload payload) {
  			
  		response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON).body(payload)
  			    	.when().put(routes.getString("Program_PutbyinvalID_URL"));
  			
  		return response;
  	}
  		
  	// Update Request with InValid ProgramName
  		public static Response UpdateByInValidProgramName(ProgramPayload payload) {
  			
  		response = given().contentType(ContentType.JSON).
					accept(ContentType.JSON).body(payload)
  			    	.when().put(routes.getString("Program_PutbyinvalidName_URL")+ProgramPayload.getProgramName());
  			
  		return response;
  	}
  			
  	// Delete Request with Valid ProgramName
  		public static Response DeleteByValidProgramName(ProgramPayload payload)	{
  				
  		System.out.println("Program Name is "+ProgramPayload.getProgramName());
  				
  		response = when().delete(routes.getString("Program_DeletebyvalidName_URL")+ProgramPayload.getProgramName());
  				
  		return response;
  	}
  			
  	// Delete Request with InValid ProgrameName
  	    public static Response DeleteByInValidProgramName(ProgramPayload payload) {
  	    	
  	    System.out.println("Program Name is "+ProgramPayload.getProgramName());
  	    	
  		response = when().delete(routes.getString("Program_DeletebyinvalidName_URL")+ProgramPayload.getProgramName());
  			
  		return response;
  	 }
}

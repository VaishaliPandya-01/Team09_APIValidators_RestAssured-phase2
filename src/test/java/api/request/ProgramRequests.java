package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.InputStream;
import java.io.File;

import com.github.fge.jsonschema.main.JsonSchemaFactory;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ProgramRequests extends RestUtils{

	
	InputStream createProgramIDJsonSchema;
	//Post Request
		public static  Response PostRequest(ProgramPayload payload) {

			/*
			try {
				 createProgramIDJsonSchema = getClass().getClassLoader ()
					    .getResourceAsStream ("createprogromid.json");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			*/
			
			response =  given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(payload)
					.when().post(routes.getString("Program_Post_URL"));
//			  .then().assertThat().body(JsonSchemaValidator.
//						      matchesJsonSchema(new File(".\\src\\test\\resources\\createprogramid.json")));
			 /*
					.then ()
				    .statusCode (201)
				    .and()
				    .assertThat ()
				    .body (JsonSchemaValidator.matchesJsonSchema (createProgramIDJsonSchema))
				    .and()
				    .extract()
				    .path("programId");
				    
					
*/   	
			
			return response;
		}
		
		//Delete Request
			public static Response DeletRequest() {
                    System.out.println("sudhaprogrampayloadvalue=================="+ProgramPayload.getProgramId());
				response = when().
						delete(routes.getString("Program_Delete_URL")+ProgramPayload.getProgramId());

				return response;
			}
}

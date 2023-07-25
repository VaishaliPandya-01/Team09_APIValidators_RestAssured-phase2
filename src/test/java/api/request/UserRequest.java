package api.request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import api.payload.UserPayload;
import api.utilities.RestUtils;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserRequest extends RestUtils{

	//Post Request
	public static Response PostRequest(UserPayload payload) {

		try {
			
			PrintStream logs = new PrintStream(new FileOutputStream("Loggs/UserPostLog.txt"));		
		response = given().
				contentType(ContentType.JSON).
				body(payload).
				filter(RequestLoggingFilter.logRequestTo(logs)).
				filter(ResponseLoggingFilter.logResponseTo(logs)).
				when().post(routes.getString("User_Post_URL"));
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	
	//Delete Student user Request
	public static Response DeletStudentRequest() {

		response = when().
				delete(routes.getString("User_Delete_URL")+StudentUser);

		return response;
	}

	
	//Delete Admin user Request
	public static Response DeletAdminRequest() {

		response = when().
				delete(routes.getString("User_Delete_URL")+AdminUser);

		return response;
	}

}

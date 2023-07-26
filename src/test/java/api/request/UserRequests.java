package api.request;

import static io.restassured.RestAssured.*;

import api.payload.*;
import api.utilities.RestUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserRequests extends RestUtils {

	// Post Request
	public static Response PostRequest(UserPayload payload) {

		response = given().contentType(ContentType.JSON).body(payload).log().all().when()
				.post(routes.getString("User_Post_URL"));
		return response;
	}

	// @GETRequest_AllUsers -User_Get_AllUsers=/users/users/
	public static Response GetAllUserRequest() {

		response = given().contentType(ContentType.JSON).log().all().when().get(routes.getString("User_Get_AllUsers"));
		return response;
	}

	// @GETRequest_Userby_UserID - User_Get_UserInfoById=/users/users/
	public static Response GetUserByIdRequest() {

		response = given().contentType(ContentType.JSON).log().all().when()
				.get(routes.getString("User_Get_UserInfoById") + AdminUser);

		return response;
	}

	// @GETRequest_Userby_Role -User_Get_AllUsers_With_Role=/users/users/roles
	public static Response GetUserByRoleRequest() {

		response = given().contentType(ContentType.JSON).log().all().when()
				.get(routes.getString("User_Get_AllUsers_With_Role"));
		return response;
	}

	// @GETRequest_GetAllStaff -User_Get_AllStaff=/users/users/getAllStaff
	public static Response GetAllStaffRequest() {

		response = given().contentType(ContentType.JSON).log().all().when().get(routes.getString("User_Get_AllStaff"));
		return response;
	}

	// PUT Request - @PUTRequest_UpdateUserById - User_PUT_UserById=/users/users/
	public static Response PutUserByIdRequest(UserWithoutRole payload) {

		response = given().contentType(ContentType.JSON).body(payload).log().all().when()
				.put(routes.getString("User_PUT_UserById") + AdminUser);

		return response;
	}

	// @07PUTRequest_UpdateUserRoleStatusById
	// --User_PUT_UserRoleStatus=/users/users/roleStatus/
	public static Response PutUserByRoleRequest(UserRoleMap payload) {

		response = given().contentType(ContentType.JSON).body(payload).log().all().when()
				.put(routes.getString("User_PUT_UserRoleStatus") + AdminUser);

		return response;
	}

	// @07PUTRequest_AssignUserToProgBatchById
	// --User_PUT_UserRoleProgBatchStatus=/users/users/roleProgramBatchStatus/
	public static Response PutUserToProgBatchRequest(UserProgBatchIdRoleMap payload) {

		response = given().contentType(ContentType.JSON).body(payload).log().all().when()
				.put(routes.getString("User_PUT_UserRoleProgBatchStatus") + AdminUser);
		return response;
	}

	// Delete Request
	public static Response DeletAdminUserRequest() {

		response = when().delete(routes.getString("User_Delete_URL") + AdminUser);
		return response;
	}

	public static Response DeletStaffUserRequest() {

		response = when().delete(routes.getString("User_Delete_URL") + StaffUser);
		return response;
	}

	public static Response DeletStuUserRequest() {

		response = when().delete(routes.getString("User_Delete_URL") + StudentUser);
		return response;
	}

}

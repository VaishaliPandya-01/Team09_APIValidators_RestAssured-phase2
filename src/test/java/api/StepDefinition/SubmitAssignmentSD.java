package api.StepDefinition;

import static io.restassured.RestAssured.baseURI;

import java.io.IOException;

import api.request.AssignmentRequest;
import api.request.AssignmentSubmitRequest;
import api.request.BatchRequests;
import api.request.ProgramRequests;
import api.request.UserRequest;
import api.requestbody.AssignmentBody;
import api.requestbody.AssignmentSubmitBody;
import api.requestbody.BatchBody;
import api.requestbody.ProgramBody;
import api.requestbody.UserBody;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitAssignmentSD extends RestUtils{

	//baseURL
	@Given("User creates request for the LMS API endpoint")
	public void User_creates_request_for_the_LMS_API_endpoint() {

		String BaseURI = routes.getString("BaseUrl");
		baseURI = BaseURI;
		log.info("user sends request with BaseURL");
	}

	//CreateNewProgram
	@When("User sends HTTPS Request and  request Body for Program with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Program_with_mandatory_additional_fields() throws IOException {

		ProgramPayload=ProgramBody.PostBody();
		response = ProgramRequests.PostRequest(ProgramPayload);		
		ProgramPayload.setProgramId(response.path("programId"));		
		log.info("All required details send  ");

	}

	//CreateNewBatch
	@When("User sends HTTPS Request and  request Body for Batch with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Batch_with_mandatory_additional_fields() throws IOException {

		BatchPayload = BatchBody.PostBody();
		response = BatchRequests.PostRequest(BatchPayload);		
		BatchPayload.setBatchId(response.path("batchId"));
		log.info("All required details send for batch  " );
	}

	//CreateNewAdminUser
	@When("User sends HTTPS Request and request Body for Admin User with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Admin_User_with_mandatory_additional_fields() throws IOException {

		UserPayload = UserBody.AdminPostBody();
		response = UserRequest.PostRequest(UserPayload);
		AdminUser=response.path("userId");
		log.info("All required details send  ");
	}

	//CreateNewStudentUser
	@When("User sends HTTPS Request and request Body for Student User with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Student_User_with_mandatory_additional_fields() throws IOException {

		UserPayload = UserBody.StudentPostBody();
		response = UserRequest.PostRequest(UserPayload);
		StudentUser=response.path("userId");
		log.info("All required details send  ");
	}


	//Create New Assignment
	@When("User sends HTTPS Request and request Body for Assignment with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_with_mandatory_additional_fields() throws IOException {

		AssignmentPayload = AssignmentBody.PostBody();
		response = AssignmentRequest.PostRequest(AssignmentPayload);
		AssignmentPayload.setAssignmentId(response.path("assignmentId"));
		log.info("All required details send  ");
	}


	//Create New Assignment Submit
	@When("User sends HTTPS Request and request Body for Assignment submit with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_submit_with_mandatory_additional_fields() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBody();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);
		AssignmentSubmitPayload.setSubmissionId(response.path("submissionId"));

		log.info("All required details send  ");
	}

	//Duplicate Assignment Submit
	@When("User sends HTTPS Request and request Body for duplicate Assignment submit with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_duplicate_Assignment_submit_with_mandatory_additional_fields() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBody();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);

		log.info("All required details send  ");
	}


	//Missing Mandatory fields assignment ID
	@When("User sends HTTPS Request and request Body for Assignment submit with missing Assignment ID")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_submit_with_missing_Assignment_ID() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBodyForMissingAssignmentID();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);

		log.info("All required details send  ");
	}

	//Missing Mandatory fields User ID
	@When("User sends HTTPS Request and request Body for Assignment submit with missing User ID")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_submit_with_missing_User_ID() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBodyForMissingUserID();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);

		log.info("All required details send  ");
	}

	//Missing Mandatory fields sub Date Time
	@When("User sends HTTPS Request and request Body for Assignment submit with missing sub Date Time")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_submit_with_missing_sub_Date_Time() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBodyForMissingsubDateTime();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);
		AssignmentSubmitPayload.setSubmissionId(response.path("submissionId"));

		log.info("All required details send  ");
	}

	//Missing Mandatory fields Submission description
	@When("User sends HTTPS Request and request Body for Assignment submit with missing Submission description")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_submit_with_missing_Submission_description() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBodyForMissingSubDesc();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);
		AssignmentSubmitPayload.setSubmissionId(response.path("submissionId"));

		log.info("All required details send  ");
	}

	//Resubmit Assignment by submission ID By Same Student
	@When("User sends Put HTTPS Request and request Body for Assignment Submit with mandatory fields")
	public void User_sends_Put_HTTPS_Request_and_request_Body_for_Assignment_Submit_with_mandatory_fields() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.ResubmitPutBody();
		response = AssignmentSubmitRequest.ResubmitAssignPutRequest(AssignmentSubmitPayload);

		log.info("All required details send  " +AssignmentSubmitPayload );
	}

	//Resubmit Assignment by submission ID without mandatory fields
	@When("User sends Put HTTPS Request and request Body for Assignment Submit without mandatory fields")
	public void User_sends_Put_HTTPS_Request_and_request_Body_for_Assignment_Submit_without_mandatory_fields() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.ResubmitWithoutManFieldsPutBody();
		response = AssignmentSubmitRequest.ResubmitAssignPutRequest(AssignmentSubmitPayload);

		log.info("All required details send  " +AssignmentSubmitPayload );
	}

	//Update Assignment Due Date By Admin
	@When("User sends put HTTPS Request and request Body for updating date in Assignment")
	public void User_sends_put_HTTPS_Request_and_request_Body_for_updating_date_in_Assignment() throws IOException {

		AssignmentPayload = AssignmentBody.PutBodyPostDueDate();
		response = AssignmentRequest.PutRequest(AssignmentPayload);
		log.info("All required details send  " +AssignmentSubmitPayload );
	}

	//Update Grade Assignment by SubmissionID
	@When("User sends Put HTTPS Request and request Body to grade Assignment Submit")
	public void User_sends_Put_HTTPS_Request_and_request_Body_to_grade_Assignment_Submit() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.GradePutBody();
		response = AssignmentSubmitRequest.GradePutRequest(AssignmentSubmitPayload);		

		log.info("All required details send  " +AssignmentSubmitPayload );
	}

	//Update Grade Assignment by SubmissionID without mandatory fields
	@When("User sends Put HTTPS Request and request Body to grade Assignment Submit without mandatory fields")
	public void User_sends_Put_HTTPS_Request_and_request_Body_to_grade_Assignment_Submit_without_mandatory_fields() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.GradePutBodyWithoutMandFields();
		response = AssignmentSubmitRequest.GradePutRequest(AssignmentSubmitPayload);		

		log.info("All required details send  " +AssignmentSubmitPayload );
	}


	//Delete Assignment Submit
	@When("User sends HTTPS delete Request for assignment submit")
	public void User_sends_HTTPS_delete_Request_for_assignment_submit() {

		AssignmentSubmitRequest.DeletRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get ALL Assignment Submit
	@When("User creates GET Request for Assignment submit")
	public void User_creates_GET_Request_for_Assignment_submit() {

		AssignmentSubmitRequest.GetAllRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get Assignment Submit by userID
	@When("User sends Get HTTPS Request for Assignment submit by User ID")
	public void User_sends_Get_HTTPS_Request_for_Assignment_submit_by_User_ID() {

		AssignmentSubmitRequest.GetAssignmentByUserIDRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get Assignment Submit by BatchID
	@When("User sends Get HTTPS Request for Assignment submit by Batch ID")
	public void User_sends_Get_HTTPS_Request_for_Assignment_submit_by_Batch_ID() {

		AssignmentSubmitRequest.GetAssignmentByBatchIDRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get Assignment Submit by Invalid userID
	@When("User sends Get HTTPS Request for Assignment submit with invalid User ID")
	public void User_sends_Get_HTTPS_Request_for_Assignment_submit_with_invalid_User_ID() {

		AssignmentSubmitRequest.GetAssignmentByUserIDRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get Assignment Submit by BatchID
	@When("User sends Get HTTPS Request for Assignment submit by invalid Batch ID")
	public void User_sends_Get_HTTPS_Request_for_Assignment_submit_by_invalid_Batch_ID() {

		AssignmentSubmitRequest.GetAssignmentByBatchIDRequest();
		log.info("DELETE Request successful: 200");
	}


	//Get grade by Assignment ID
	@When("User sends HTTPS Get Request for Assignment submit with assignment ID")
	public void User_sends_HTTPS_Get_Request_for_Assignment_submit_with_assignment_ID() {

		AssignmentSubmitRequest.GetGradeByAssignIDRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get grade by Student ID
	@When("User sends HTTPS Get Request for Assignment submit with Student ID")
	public void User_sends_HTTPS_Get_Request_for_Assignment_submit_with_Student_ID() {

		AssignmentSubmitRequest.GetGradeByStudentIDRequest();
		log.info("DELETE Request successful: 200");
	}

	//Get grade by Batch ID
	@When("User sends HTTPS Get Request for Assignment submit with Batch ID")
	public void User_sends_HTTPS_Get_Request_for_Assignment_submit_with_batch_ID() {

		AssignmentSubmitRequest.GetGradeByBatchIDRequest();
		log.info("DELETE Request successful: 200");
	}


	//Delete Assignment
	@When("User sends HTTPS delete Request for assignment")
	public void User_sends_HTTPS_delete_Request_for_assignment() {

		AssignmentRequest.DeletRequest();
		log.info("DELETE Request successful: 200");
	}


	//Delete Student User
	@When("User sends HTTPS delete Request for student user")
	public void User_sends_HTTPS_delete_Request_for_student_user() {

		UserRequest.DeletStudentRequest();
		log.info("DELETE Request successful: 200");
	}

	//Delete Admin User
	@When("User sends HTTPS delete Request for admin user")
	public void User_sends_HTTPS_delete_Request_for_admin_user() {

		UserRequest.DeletAdminRequest();
		log.info("DELETE Request successful: 200");
	}

	//Delete Batch
	@When("User sends HTTPS delete Request for batch")
	public void User_sends_HTTPS_delete_Request_for_batch() {

		BatchRequests.DeletRequest();
		log.info("DELETE Request successful: 200");
	}

	//Delete Program
	@When("User sends HTTPS delete Request for program")
	public void User_sends_HTTPS_delete_Request_for_program() {

		ProgramRequests.DeletRequest();
		log.info("DELETE Request successful: 200");
	}


	//Validate Status Code and Data
	@Then("Validate response code {int}")
	public void validate_response_code(Integer statusCode){		
		
		if (statusCode == 200) {	
			
			response.then().assertThat()
			.statusCode(statusCode).log().all().extract().response();
			
			log.info("Program is created susseccfully");

		} else {
			log.info("Request failed");
			log.error("Not Found: 404");
		}

		
		log.info("Program Created Successfully") ;
	}


	@Then("User receives {int} Created Status with response body")
	public void user_receives_Created_Status_with_response_body(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

	@Then("User receives {int} Ok status with message")
	public void User_receives_Ok_status_with_message(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

	@Then("User receives {int} Not Found Status with message")
	public void User_receives_Not_Found_Status_with_message(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

	@Then("User receives {int} Bad Request Status with message")
	public void User_receives_Bad_Request_Status_with_message(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

	@Then("User receives {int} OK Status with response body")
	public void User_receives_OK_Status_with_response_body(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

	@Then("User receives {int} OK Status with updated value in response body")
	public void User_receives_OK_Status_with_updated_value_in_response_body(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

}

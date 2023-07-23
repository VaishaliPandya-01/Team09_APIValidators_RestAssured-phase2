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

	//CreateNewUser
	@When("User sends HTTPS Request and  request Body for User with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_User_with_mandatory_additional_fields() throws IOException {

		UserPayload = UserBody.PostBody();
		response = UserRequest.PostRequest(UserPayload);
		UserPayload.setUserId(response.path("userId"));
		log.info("All required details send  ");
	}


	//Create New Assignment
	@When("User sends HTTPS Request and  request Body for Assignment with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_with_mandatory_additional_fields() throws IOException {

		AssignmentPayload = AssignmentBody.PostBody();
		response = AssignmentRequest.PostRequest(AssignmentPayload);
		AssignmentPayload.setAssignmentId(response.path("assignmentId"));
		log.info("All required details send  ");
	}


	//Create New Assignment Submit
	@When("User sends HTTPS Request and  request Body for Assignment submit with mandatory ,additional fields")
	public void user_sends_HTTPS_Request_and_request_Body_for_Assignment_submit_with_mandatory_additional_fields() throws IOException {

		AssignmentSubmitPayload = AssignmentSubmitBody.PostBody();
		response = AssignmentSubmitRequest.PostRequest(AssignmentSubmitPayload);
		AssignmentSubmitPayload.setSubmissionId(response.path("submissionId"));
		
		System.out.println("my Data======================>" +AssignmentSubmitPayload.getSubmissionId());
		log.info("All required details send  ");
	}


	//Delete Assignment Submit
	@When("User sends HTTPS delete Request for assignment submit")
	public void User_sends_HTTPS_delete_Request_for_assignment_submit() {

		AssignmentSubmitRequest.DeletRequest();
		log.info("DELETE Request successful: 200");
	}


	//Delete Assignment
	@When("User sends HTTPS delete Request for assignment")
	public void User_sends_HTTPS_delete_Request_for_assignment() {

		AssignmentRequest.DeletRequest();
		log.info("DELETE Request successful: 200");
	}


	//Delete User
	@When("User sends HTTPS delete Request for user")
	public void User_sends_HTTPS_delete_Request_for_user() {

		UserRequest.DeletRequest();
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
	public void validate_response_code(Integer statusCode) {

		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}


	@Then("User receives {int} Created Status with response body")
	public void user_receives_Created_Status_with_response_body(Integer statusCode) {
		
		response.then().assertThat()
		.statusCode(statusCode)
		.log().all();
		log.info("User get response") ;
	}

}

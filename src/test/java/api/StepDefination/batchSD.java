package api.StepDefination;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import api.request.BatchRequests;
import api.request.ProgramRequests;
import api.requestbody.BatchBody;
import api.requestbody.ProgramBody;
import api.utilities.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class batchSD extends RestUtils{

	
	Response response;
	static String programName;
	static int programID;
	static int batchID;
	static String batchName;
	public String requestBody;
	
	//baseURL
	@Given("User creates request for the LMS API endpoint")
	public void user_creates_request_for_the_LMS_API_endpoint() {
		String BaseURI = routes.getString("BaseUrl");
		baseURI = BaseURI;
		
		log.info("user sends request with BaseURL");
	}

	//Createprogram
	@When("User sends HTTPS post request for program and request body with mandatory and additional fields")
	public void user_sends_HTTPS_post_request_for_program_and_request_body_with_mandatory_and_additional_fields() throws IOException {
		
		ProgramPayload=ProgramBody.PostBody();
		response = ProgramRequests.PostRequest(ProgramPayload);		
		ProgramPayload.setProgramId(response.path("programId"));		
		log.info("All required details for program id creation sent  ");
		
	}

	@Then("User receives {int} created status for program")
	public void user_receives_created_status_for_program(Integer int1) {
		
		response.then().assertThat().statusCode(201).log().all();
		assertEquals(response.getStatusCode(),201);	
		log.info("==========Program Id created successfully==============  ");  
	}

	
    //CreateBatch
	@When("User sends HTTPS post request for batch and request body with mandatory and additional fields")
	public void user_sends_HTTPS_post_request_for_batch_and_request_body_with_mandatory_and_additional_fields() throws IOException{
		
		BatchPayload=BatchBody.PostBody();	
		response = BatchRequests.PostRequest(BatchPayload);			
		BatchPayload.setBatchId(response.path("batchId"));		
		System.out.println(BatchPayload.getBatchId());
		log.info("All required details for program id creation sent  ");
		
	}

	@Then("User receives {int} created status for batch")
	public void user_receives_created_status_for_batch(Integer int1) {
	
		File Batchpostjson = xlutilsjson.getJSONFile(".\\src\\test\\resources\\batchpost.json");
		response.then().assertThat().body(matchesJsonSchema(Batchpostjson)).statusCode(201).log().all();
		log.info("=========Batch Id created successfully============  ");  
	}
	
	//Create Batch with Existng BatchName
	@When("User sends HTTPS Post Request with existing BatchName")
	public void user_sends_HTTPS_Post_Request_with_existing_BatchName() {
	    
	}

	@Then("User receives {int} Bad Request Status with message")
	public void user_receives_Bad_Request_Status_with_message(Integer int1) {
	    
	}
	
	
	//CreateBatchwithmissingfields
	
	@When("User sends HTTPS post request for batch and request body without mandatory and additional fields")
	public void user_sends_HTTPS_post_request_for_batch_and_request_body_without_mandatory_and_additional_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User receives {int} Bad Request status for missing fields in batch module")
	public void user_receives_Bad_Request_status_for_missing_fields_in_batch_module(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	//Getallbatch
	@When("User creates GET Request for the LMS API endpoint")
	public void user_creates_GET_Request_for_the_LMS_API_endpoint() {
	    response = BatchRequests.GetRequest();
	}

	@Then("User receives {int} status code with response body")
	public void user_receives_status_code_with_response_body(Integer int1) {
	   response.then().assertThat().statusCode(200).log().all();
	}
	
	
	//GetBatchByID
	@When("User creates GET Request for the LMS API endpoint with valid Batch ID")
	public void user_creates_GET_Request_for_the_LMS_API_endpoint_with_valid_Batch_ID() {
	   response =  BatchRequests.GetBatchByIDRequest();
	}

	@Then("User receives {int} OK Status with response body for batchID")
	public void user_receives_OK_Status_with_response_body_for_batchID(Integer int1) {
		
		response.then().assertThat().statusCode(200).log().all();
		File BatchgetbyIDjson = xlutilsjson.getJSONFile(".\\src\\test\\resources\\GetBatchID.json");		
		response.then().assertThat().body(matchesJsonSchema(BatchgetbyIDjson))
		.assertThat().statusCode(200).log().all();
		System.out.println("============GetbyID==================");
	}
	
	//GetBatchByName
	@When("User creates GET Request for the LMS API endpoint with valid Batch Name")
	public void user_creates_GET_Request_for_the_LMS_API_endpoint_with_valid_Batch_Name() {
	    response = BatchRequests.GetBatchByNameRequest();
	    
	}
	
	@Then("User receives {int} OK Status with batch response body")
	public void user_receives_OK_Status_with_batch_response_body(Integer int1) {		
		File Batchgetbynamejson = xlutilsjson.getJSONFile(".\\src\\test\\resources\\batchgetbyname.json");		
		response.then().assertThat().body(matchesJsonSchema(Batchgetbynamejson)).statusCode(200).log().all();
		System.out.println("============Getbybatchname==================");
	}
	
	
	//GetBatchByProgramID
	@When("User creates Get Request for getting Batch by Valid ProgramID")
	public void user_creates_Get_Request_for_getting_Batch_by_Valid_ProgramID() {
	    response = BatchRequests.GetBatchByProgIDRequest();
	}

	@Then("User receives {int} OK Status with response body for batch by programID")
	public void user_receives_OK_Status_with_response_body_for_batch_by_programID(Integer int1) {
	   response.then().log().all();
	}
	
	//UpdatebyBatchID	
	@When("User sends HTTPS Update Request and request Body with mandatory & additional  fields")
	public void user_sends_HTTPS_Update_Request_and_request_Body_with_mandatory_additional_fields() throws IOException{		
			BatchPayload.setBatchName(BatchPayload.getBatchName()+"-UPDATEDBATCH");
		 response= BatchRequests.UpdateBatchByIDRequest(BatchPayload);					
		System.out.println("====UpdatedBatchName=============");
		
	}

	@Then("User receives {int} OK Status with updated value in response body for batch")
	public void user_receives_OK_Status_with_updated_value_in_response_body_for_batch(Integer int1) {
		File UpdateBatchjson = xlutilsjson.getJSONFile(".\\src\\test\\resources\\GetBatchID.json");		
		response.then().assertThat().body(matchesJsonSchema(UpdateBatchjson))
		.assertThat().statusCode(200).log().all();
		System.out.println("====UpdatedBatchName=============");
	}
	
	//Update by Invalid batchID
	@When("User creates PUT Request for the LMS API endpoint  and  invalid batch ID")
	public void user_creates_PUT_Request_for_the_LMS_API_endpoint_and_invalid_batch_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User receives {int} Not Found Status with message for update by batchID")
	public void user_receives_Not_Found_Status_with_message_for_update_by_batchID(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


    //Delete batch
	@When("User sends HTTPS delete Request for batch")
	public void user_sends_HTTPS_delete_Request_for_batch() {		
		response = BatchRequests.DeletRequest();	
		
	}

	@Then("User receives {int} Ok status for batch with message")
	public void user_receives_Ok_status_for_batch_with_message(Integer int1) {
		response.then().assertThat().statusCode(200).log().all();
		//Message: Batch with Id-7267 deleted Successfully!	
		log.info("=======Batch Deleted========= ");
		
	}
	
	//GetBatchbyInvalidBatchId
	@When("User creates GET Request for the LMS API endpoint with Invalid Batch ID")
	public void user_creates_GET_Request_for_the_LMS_API_endpoint_with_Invalid_Batch_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User receives {int} OK Status with response body with Invalid batchID")
	public void user_receives_OK_Status_with_response_body_with_Invalid_batchID(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
    //Delete Program
	@When("User sends HTTPS delete Request for program")
	public void user_sends_HTTPS_delete_Request_for_program() {
		response = ProgramRequests.DeletRequest();
	}

	@Then("User receives {int} Ok status for program with message")
	public void user_receives_Ok_status_for_program_with_message(Integer int1) {
		response.then().assertThat().statusCode(200).log().all();
		log.info("======Program Deleted====== ");   
	}
	
	//GetBatch by Invalid programID
	@When("User creates GET Request for the LMS API endpoint with invalid Program Id")
	public void user_creates_GET_Request_for_the_LMS_API_endpoint_with_invalid_Program_Id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User receives {int} Not Found Status with message")
	public void user_receives_Not_Found_Status_with_message(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}

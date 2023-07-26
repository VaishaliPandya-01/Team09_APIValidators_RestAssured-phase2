package api.POJO;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Testdata_User_JsonFromPOJO {

	public static UserPost_Payload generateUserPostdata() throws JsonProcessingException {

		// normal json
		UserPost_Payload userPdata = new UserPost_Payload();

		userPdata.setUserComments("New User for Admin role");
		userPdata.setUserEduPg("MS");
		userPdata.setUserEduUg("BE");
		userPdata.setUserFirstName("APIValidators_100");
		userPdata.setUserLastName("Lname");
		userPdata.setUserLinkedinUrl("www.linkedin.com/Testing1");
		userPdata.setUserPhoneNumber("1122336789");
		userPdata.setUserMiddleName("M");
		userPdata.setUserLocation("US");
		userPdata.setUserTimeZone("CST");
		userPdata.setUserVisaStatus("GC-EAD");

		// json in array
		UserRoleMaps_Payload roleAdmin = new UserRoleMaps_Payload();
		roleAdmin.setRoleId("R01");
		roleAdmin.setUserRoleStatus("Active");

		List<UserRoleMaps_Payload> userRoleMaps = new ArrayList<>();
		userRoleMaps.add(roleAdmin);
		userPdata.setUserRoleMaps(userRoleMaps);

		return userPdata;
		// ObjectMapper objectMapper= new ObjectMapper();
		// String
		// uPostData=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userPdata);
		// System.out.println(uPostData);
	}

	public static UserPost_Payload updateUserdata() throws JsonProcessingException {

		// normal json
		UserPost_Payload userdata = new UserPost_Payload();

		userdata.setUserComments("Update UserLocation for Admin role");
		userdata.setUserEduPg("MS");
		userdata.setUserEduUg("BE");
		userdata.setUserFirstName("APIValidators_100");
		userdata.setUserLastName("Lname");
		userdata.setUserLinkedinUrl("www.linkedin.com/Testing1");
		userdata.setUserPhoneNumber("1122336789");
		userdata.setUserMiddleName("M");
		userdata.setUserLocation("India");
		userdata.setUserTimeZone("IST");
		userdata.setUserVisaStatus("GC-EAD");
		// json in array
		UserRoleMaps_Payload roleAdmin = new UserRoleMaps_Payload();
		roleAdmin.setRoleId("R01");
		roleAdmin.setUserRoleStatus("Active");

		List<UserRoleMaps_Payload> userRoleMaps = new ArrayList<>();
		userRoleMaps.add(roleAdmin);
		userdata.setUserRoleMaps(userRoleMaps);

		return userdata;
	}

	public static User_Payload generatePUTuserdata() throws JsonProcessingException {

		// normal json
		User_Payload userdata = new User_Payload();

		userdata.setUserComments("Update UserLocation for Admin role");
		userdata.setUserEduPg("MS");
		userdata.setUserEduUg("BE");
		userdata.setUserFirstName("APIValidators_100");
		userdata.setUserLastName("Lname");
		userdata.setUserLinkedinUrl("www.linkedin.com/Testing1");
		userdata.setUserPhoneNumber("1122336789");
		userdata.setUserMiddleName("M");
		userdata.setUserLocation("India");
		userdata.setUserTimeZone("IST");
		userdata.setUserVisaStatus("GC-EAD");
		return userdata;

	}

public static	UserRoleMaps_Payload generatePUTRoleStatusdata() {
	
	UserRoleMaps_Payload userdata =new UserRoleMaps_Payload();
	userdata.setRoleId("R01");
	userdata.setUserRoleStatus("Active");
	
	return userdata;

}

public static	userPUT_ProgBatchStatus_Payload generateRoleProgBatchStatusdata(String programId, String batchId,String userId ) {
	
	userPUT_ProgBatchStatus_Payload userdata=new userPUT_ProgBatchStatus_Payload();
	
	userdata.setProgramId(programId);
	userdata.setRoleId("R01");
	userdata.setUserId(userId);
	
	userRoleProgramBatches_Payload roleBatch=new userRoleProgramBatches_Payload();
	roleBatch.setBatchId(batchId);
	roleBatch.setUserRoleProgramBatchStatus(null);
			
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	List<userRoleProgramBatches_Payload> userRolemap= new ArrayList<>();
	userRolemap.add(roleBatch);
	userdata.setUserRoleProgramBatches(userRolemap);
	
	return userdata;

}

public static	PostProgram_Payload generatePostProgramdata() {
	
	PostProgram_Payload userdata=new PostProgram_Payload();
	//Jul23-TeamName-ProgramName-serial number 
	userdata.setProgramDescription("REST API Learning");
	userdata.setProgramName("Jul23-APIValidators-SDET-100");
	userdata.setProgramStatus("Active");
		
	return userdata;

}

public static	PostBatch_Payload generatePostBatchdata(String programId) {
	
	PostBatch_Payload userdata=new PostBatch_Payload();
	//Jul23-TeamName-ProgramName-serial number 
	userdata.setBatchDescription("SDET API learning");
	userdata.setBatchName("Jul23-APIValidators-SDET-SDET01-100");
	userdata.setBatchNoOfClasses("10");
	userdata.setBatchStatus("Active");
	userdata.setProgramId(programId);
		
	return userdata;

}


}

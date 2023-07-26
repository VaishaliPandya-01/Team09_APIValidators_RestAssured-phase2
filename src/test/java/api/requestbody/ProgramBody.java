package api.requestbody;

import api.utilities.RestUtils;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

import api.payload.ProgramPayload;

public class ProgramBody extends RestUtils {
	
	public static ProgramPayload PostBody() throws IOException {
		
		
	//	ProgramPayload.setProgramName("Jul23-APIValidators-SDET-100");
	//	ProgramPayload.setProgramDescription("Learning RestAssured API");
	//	ProgramPayload.setProgramStatus("Active");
	//	System.out.println("Inside postbody ProgramBody name" + ProgramPayload.getProgramName());
		ProgramPayload.setProgramName(xlutils.getCellData("programpostdata", 1, 0)+RandomStringUtils.randomNumeric(3));
		ProgramPayload.setProgramDescription(xlutils.getCellData("programpostdata", 1, 1));
		ProgramPayload.setProgramStatus(xlutils.getCellData("programpostdata", 1, 2));
		
		
	//	ProgramPayload.setProgramName(xlutils.getCellData("programpostdata", 1, 0)+RandomStringUtils.randomNumeric(3));
		return ProgramPayload;

	
	

}
}

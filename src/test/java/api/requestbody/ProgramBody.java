package api.requestbody;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;

public class ProgramBody extends RestUtils{
	
	public static ProgramPayload PostBody() throws IOException {

		ProgramPayload.setProgramName(xlutils.getCellData("programpostdata", 1, 0)+RandomStringUtils.randomNumeric(3));
		ProgramPayload.setProgramDescription(xlutils.getCellData("programpostdata", 1, 1));
		ProgramPayload.setProgramStatus(xlutils.getCellData("programpostdata", 1, 2));
		
		return ProgramPayload;

	}

}

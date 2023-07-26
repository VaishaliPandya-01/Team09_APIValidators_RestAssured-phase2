package requestbody;

import java.io.IOException;

import payload.ProgramPayload;
import utilities.RestUtils;
import utilities.XLUtils;

public class ProgramBody extends RestUtils {
	public static ProgramPayload PostBody() throws IOException {

		ProgramPayload.setProgramName(xlutils.getCellData("programpostdata", 1, 0));
		ProgramPayload.setProgramDescription(xlutils.getCellData("programpostdata", 1, 1));
		ProgramPayload.setProgramStatus(xlutils.getCellData("programpostdata", 1, 2));
		
		return ProgramPayload;

	}

}

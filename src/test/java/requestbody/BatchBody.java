package requestbody;

import java.io.IOException;

import payload.BatchPayload;
import utilities.RestUtils;

public class BatchBody extends RestUtils {
	
	public static BatchPayload PostBody() throws IOException {
		
		BatchPayload.setBatchDescription(xlutils.getCellData("batchpostdata", 1, 0));
		BatchPayload.setBatchName(ProgramPayload.getProgramName() + xlutils.getCellData("batchpostdata", 1, 1));
		BatchPayload.setBatchNoOfClasses(xlutils.getCellData("batchpostdata", 1, 2));
		BatchPayload.setBatchStatus(xlutils.getCellData("batchpostdata", 1, 3));
		BatchPayload.setProgramId(ProgramPayload.getProgramId());
			
		return BatchPayload;
	}

}

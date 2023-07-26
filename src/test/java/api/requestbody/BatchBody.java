package api.requestbody;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

import api.payload.BatchPayload;
import api.utilities.RestUtils;

public class BatchBody extends RestUtils{
	
	
	public static BatchPayload PostBody() throws IOException {
		
	BatchPayload.setBatchDescription(xlutils.getCellData("batchpostdata", 1, 0));
	BatchPayload.setBatchName(ProgramPayload.getProgramName() + xlutils.getCellData("batchpostdata", 1, 1));//+RandomStringUtils.randomNumeric(3));
	BatchPayload.setBatchNoOfClasses(xlutils.getCellData("batchpostdata", 1, 2));
	BatchPayload.setBatchStatus(xlutils.getCellData("batchpostdata", 1, 3));
	BatchPayload.setProgramId(ProgramPayload.getProgramId());
	
	
		
	return BatchPayload;
}
	
	
	public static BatchPayload PostBodyEmpty() throws IOException {
			
			BatchPayload.setBatchDescription(xlutils.getCellData("batchpostdata", 2, 0));
			BatchPayload.setBatchName(ProgramPayload.getProgramName() + xlutils.getCellData("batchpostdata", 2, 1));//+RandomStringUtils.randomNumeric(3));
			BatchPayload.setBatchNoOfClasses(xlutils.getCellData("batchpostdata", 2, 2));
			BatchPayload.setBatchStatus(xlutils.getCellData("batchpostdata", 2, 3));
			BatchPayload.setProgramId(ProgramPayload.getProgramId());
				
			return BatchPayload;
		}
	
	public static BatchPayload PutBodyInvalidID () throws IOException {
		
		BatchPayload.setBatchId(Integer.parseInt(xlutils.getCellData("batchpostdata", 2, 4)));
		
		return BatchPayload;
		
	}
	
	public static BatchPayload GetBatchbyInvalidProgID () throws IOException {
		
		BatchPayload.setProgramId(Integer.parseInt(xlutils.getCellData("batchpostdata", 3, 5)));
		
		return BatchPayload;
		
	}
	
public static BatchPayload GetBatchbyInvalidBatchName () throws IOException {
		
		BatchPayload.setBatchName(xlutils.getCellData("batchpostdata", 4, 6));
		
		return BatchPayload;
		
	}

}

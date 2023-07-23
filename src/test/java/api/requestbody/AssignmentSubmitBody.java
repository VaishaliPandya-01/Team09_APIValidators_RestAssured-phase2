package api.requestbody;

import java.io.IOException;

import api.payload.AssignmentSubmitPayload;
import api.utilities.RestUtils;

public class AssignmentSubmitBody extends RestUtils{

	
	//Assignment Submit Post Body
	public static AssignmentSubmitPayload PostBody() throws IOException {			
		
		AssignmentSubmitPayload.setAssignmentId(AssignmentPayload.getAssignmentId());
		AssignmentSubmitPayload.setUserId(UserPayload.getUserId());
		AssignmentSubmitPayload.setSubDesc(xlutils.getCellData("AssignSubmitpostdata", 1, 0));
		AssignmentSubmitPayload.setSubComments(xlutils.getCellData("AssignSubmitpostdata", 1, 1));
		AssignmentSubmitPayload.setSubPathAttach1(xlutils.getCellData("AssignSubmitpostdata", 1, 2));
		AssignmentSubmitPayload.setSubPathAttach2(xlutils.getCellData("AssignSubmitpostdata", 1, 3));
		AssignmentSubmitPayload.setSubPathAttach3(xlutils.getCellData("AssignSubmitpostdata", 1, 4));
		AssignmentSubmitPayload.setSubPathAttach4(xlutils.getCellData("AssignSubmitpostdata", 1, 5));
		AssignmentSubmitPayload.setSubPathAttach5(xlutils.getCellData("AssignSubmitpostdata", 1, 6));
		AssignmentSubmitPayload.setSubDateTime(xlutils.getCellData("AssignSubmitpostdata", 1, 7));//07-20-2023 18:07:30
		
		
	return AssignmentSubmitPayload;
	}
}

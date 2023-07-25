package api.requestbody;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

import api.payload.AssignmentPayload;
import api.utilities.RestUtils;

public class AssignmentBody extends RestUtils{

	public static AssignmentPayload PostBody() throws IOException {
		
		AssignmentPayload.setAssignmentDescription(xlutils.getCellData("Assignmentpostdata", 1, 0));
		AssignmentPayload.setAssignmentName(ProgramPayload.getProgramName()+ xlutils.getCellData("Assignmentpostdata", 1, 1)+RandomStringUtils.randomNumeric(2));
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(xlutils.getCellData("Assignmentpostdata", 1, 2));
		AssignmentPayload.setCreatedBy(AdminUser);
		AssignmentPayload.setDueDate(xlutils.getCellData("Assignmentpostdata", 1, 3));//2023-07-29T22:00:04.964+00:00
		AssignmentPayload.setGraderId(AdminUser);
		AssignmentPayload.setPathAttachment1(xlutils.getCellData("Assignmentpostdata", 1, 4));
		AssignmentPayload.setPathAttachment2(xlutils.getCellData("Assignmentpostdata", 1, 5));
		AssignmentPayload.setPathAttachment3(xlutils.getCellData("Assignmentpostdata", 1, 6));
		AssignmentPayload.setPathAttachment4(xlutils.getCellData("Assignmentpostdata", 1, 7));
		AssignmentPayload.setPathAttachment5(xlutils.getCellData("Assignmentpostdata", 1, 8));

		return AssignmentPayload;

	}
	
public static AssignmentPayload PutBodyPostDueDate() throws IOException {
		
		AssignmentPayload.setAssignmentDescription(AssignmentPayload.getAssignmentDescription());
		AssignmentPayload.setAssignmentName(AssignmentPayload.getAssignmentName());
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(AssignmentPayload.getComments());
		AssignmentPayload.setCreatedBy(AdminUser);
		AssignmentPayload.setDueDate(xlutils.getCellData("Assignmentputdata", 1, 3));//2023-07-29T22:00:04.964+00:00
		AssignmentPayload.setGraderId(AdminUser);

		return AssignmentPayload;

	}

}

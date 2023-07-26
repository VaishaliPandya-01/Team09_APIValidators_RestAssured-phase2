package requestbody;
import java.io.IOException;

import payload.AssignmentPayload;
import utilities.RestUtils;
import java.util.Random;
public class AssignmentBody extends RestUtils{
	
	
	public static AssignmentPayload PostBody()  throws IOException{
		Random random = new Random();
		int AssSerialNum = random.nextInt(1000);
		
		AssignmentPayload.setAssignmentDescription(xlutils.getCellData("Assignmentpostdata", 1, 0));
		//AssignmentPayload.setAssignmentId(0);
        AssignmentPayload.setAssignmentName(ProgramPayload.getProgramName()+ xlutils.getCellData("Assignmentpostdata", 1, 1)+AssSerialNum);
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(xlutils.getCellData("Assignmentpostdata", 1 , 2));
		AssignmentPayload.setCreatedBy(UserPayload.getUserId());
		AssignmentPayload.setDueDate(xlutils.getCellData("Assignmentpostdata", 1 , 3));
		AssignmentPayload.setGraderId(UserPayload.getUserId());
		AssignmentPayload.setPathAttachment1(xlutils.getCellData("Assignmentpostdata", 1, 4));
		AssignmentPayload.setPathAttachment2(xlutils.getCellData("Assignmentpostdata", 1, 5));
		AssignmentPayload.setPathAttachment3(xlutils.getCellData("Assignmentpostdata", 1, 6));
		AssignmentPayload.setPathAttachment4(xlutils.getCellData("Assignmentpostdata", 1, 7));
		AssignmentPayload.setPathAttachment5(xlutils.getCellData("Assignmentpostdata", 1, 8));

	return AssignmentPayload;
	
	}
	
	public static AssignmentPayload PostBodyAss2() throws IOException {
		Random random = new Random();
		int AssSerialNum = random.nextInt(1000);
	//AssignmentPayload asspayload = new AssignmentPayload();	 
	AssignmentPayload.setAssignmentDescription(xlutils.getCellData("Assignmentpostdata", 2, 0));
	//AssignmentPayload.setAssignmentId(0);
	AssignmentPayload.setAssignmentName(ProgramPayload.getProgramName()+ xlutils.getCellData("Assignmentpostdata", 2, 1)+AssSerialNum);
AssignmentPayload.setBatchId(BatchPayload.getBatchId());
	AssignmentPayload.setComments(xlutils.getCellData("Assignmentpostdata", 2, 2));
	AssignmentPayload.setCreatedBy(UserPayload.getUserId());
	AssignmentPayload.setDueDate(xlutils.getCellData("Assignmentpostdata", 2, 3));
	AssignmentPayload.setGraderId(UserPayload.getUserId());
	AssignmentPayload.setPathAttachment1(xlutils.getCellData("Assignmentpostdata", 2, 4));
AssignmentPayload.setPathAttachment2(xlutils.getCellData("Assignmentpostdata", 2, 5));
	AssignmentPayload.setPathAttachment3(xlutils.getCellData("Assignmentpostdata", 2, 6));
	AssignmentPayload.setPathAttachment4(xlutils.getCellData("Assignmentpostdata", 2, 7));
	AssignmentPayload.setPathAttachment5(xlutils.getCellData("Assignmentpostdata", 2, 8));
		
	return AssignmentPayload;
	
	}
	public static AssignmentPayload PostBodyExistingValues()  throws IOException{
		Random random = new Random();
		int AssSerialNum = random.nextInt(1000);
		
		AssignmentPayload.setAssignmentDescription(xlutils.getCellData("Assignmentpostdata", 1, 0));
		//AssignmentPayload.setAssignmentId(0);
        AssignmentPayload.setAssignmentName(AssignmentPayload.getAssignmentName());
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(xlutils.getCellData("Assignmentpostdata", 1 , 2));
		AssignmentPayload.setCreatedBy(UserPayload.getUserId());
		AssignmentPayload.setDueDate(xlutils.getCellData("Assignmentpostdata", 1 , 3));
		AssignmentPayload.setGraderId(UserPayload.getUserId());
		AssignmentPayload.setPathAttachment1(xlutils.getCellData("Assignmentpostdata", 1, 4));
		AssignmentPayload.setPathAttachment2(xlutils.getCellData("Assignmentpostdata", 1, 5));
		AssignmentPayload.setPathAttachment3(xlutils.getCellData("Assignmentpostdata", 1, 6));
		AssignmentPayload.setPathAttachment4(xlutils.getCellData("Assignmentpostdata", 1, 7));
		AssignmentPayload.setPathAttachment5(xlutils.getCellData("Assignmentpostdata", 1, 8));

	return AssignmentPayload;
	
	}
	
	public static AssignmentPayload missingFieldPostBody() throws IOException {
		Random random = new Random();
		int AssSerialNum = random.nextInt(1000);
		
		AssignmentPayload.setAssignmentDescription(xlutils.getCellData("Assignmentpostdata", 2, 0));
		AssignmentPayload.setAssignmentName("");
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(xlutils.getCellData("Assignmentpostdata", 2, 2));
		AssignmentPayload.setCreatedBy(UserPayload.getUserId());
		AssignmentPayload.setDueDate(xlutils.getCellData("Assignmentpostdata", 2, 3));//2023-07-29T22:00:04.964+00:00
		AssignmentPayload.setGraderId(UserPayload.getUserId());
		AssignmentPayload.setPathAttachment1(xlutils.getCellData("Assignmentpostdata", 2, 4));
		AssignmentPayload.setPathAttachment2(xlutils.getCellData("Assignmentpostdata", 2, 5));
		AssignmentPayload.setPathAttachment3(xlutils.getCellData("Assignmentpostdata", 2, 6));
		AssignmentPayload.setPathAttachment4(xlutils.getCellData("Assignmentpostdata", 2, 7));
		AssignmentPayload.setPathAttachment5(xlutils.getCellData("Assignmentpostdata", 2, 8));
		
		return AssignmentPayload;
		
	}
	public static AssignmentPayload PutBody() throws IOException{
		
		Random random = new Random();
		int AssSerialNum = random.nextInt(1000);
		AssignmentPayload.setAssignmentDescription("JAVA Assignment");
		//AssignmentPayload.setAssignmentId(0);
        AssignmentPayload.setAssignmentName(ProgramPayload.getProgramName()+ xlutils.getCellData("Assignmentpostdata", 1, 1)+AssSerialNum);
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(xlutils.getCellData("Assignmentpostdata", 1 , 2));
		AssignmentPayload.setCreatedBy(UserPayload.getUserId());
		AssignmentPayload.setDueDate("2023-07-29T22:00:04.964+00:00");
		AssignmentPayload.setGraderId(UserPayload.getUserId());
		AssignmentPayload.setPathAttachment1(xlutils.getCellData("Assignmentpostdata", 1, 4));
		AssignmentPayload.setPathAttachment2(xlutils.getCellData("Assignmentpostdata", 1, 5));
		AssignmentPayload.setPathAttachment3(xlutils.getCellData("Assignmentpostdata", 1, 6));
		AssignmentPayload.setPathAttachment4(xlutils.getCellData("Assignmentpostdata", 1, 7));
		AssignmentPayload.setPathAttachment5(xlutils.getCellData("Assignmentpostdata", 1, 8));

	return AssignmentPayload;
	}
	public static AssignmentPayload PutBodyMissingField() throws IOException{
		
		AssignmentPayload.setAssignmentDescription(AssignmentPayload.getAssignmentDescription());
		AssignmentPayload.setAssignmentName(AssignmentPayload.getAssignmentName());
		AssignmentPayload.setBatchId(BatchPayload.getBatchId());
		AssignmentPayload.setComments(AssignmentPayload.getComments());
		AssignmentPayload.setCreatedBy("");

		AssignmentPayload.setGraderId(UserPayload.getUserId());

		return AssignmentPayload;
		
	}
	
}

package utilities;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import payload.AssignmentPayload;
import utilities.XLUtils;
import payload.BatchPayload;
import payload.ProgramPayload;
import payload.UserPayload;
import payload.UserRoleMap;
import io.restassured.response.Response;

import java.io.File;
import java.util.Random;

public class RestUtils {
	
	/*public static ResourceBundle routes = ResourceBundle.getBundle("ConfigRoutes/Routes");
	public static Logger log = LogManager.getLogger();
	public static String path =".\\src\\test\\resources\\TestData\\DataExcel.xlsx";
	public static XLUtils xlutils=new XLUtils(path);
	public static Response response;
	public static ProgramPayload ProgramPayload = new ProgramPayload();
	public static BatchPayload BatchPayload = new BatchPayload();
	//public static UserPayload UserPayload = new UserPayload();
	public static UserRoleMap UserRoleMap = new UserRoleMap();
	public static AssignmentPayload AssignmentPayload = new AssignmentPayload();
	public static int i;*/
	//public static UserPayload UserPayload = new UserPayload();
		public static UserRoleMap UserRoleMap = new UserRoleMap();
	
	public static  ResourceBundle routes = ResourceBundle.getBundle("Routes");
	public static Logger log = LogManager.getLogger();
	
	public static ResourceBundle path =ResourceBundle.getBundle("path");
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));
	
	public static File postAssignmentJson = xlutils.getJSONFile(path.getString("postAssignmentJson"));			
	//public static File getbatchbynameJson = xlutils.getJSONFile(path.getString("getbatchbynameJson"));
	//public static File getbatchIDJson = xlutils.getJSONFile(path.getString("getbatchIDJson"));
	//public static File updatebatchIDJson = xlutils.getJSONFile(path.getString("batchupdatebyIDJson"));
	
	public static Response response;
	
	public static ProgramPayload ProgramPayload = new ProgramPayload();
	public static BatchPayload BatchPayload = new BatchPayload();
	public static UserPayload UserPayload = new UserPayload();
	public static AssignmentPayload AssignmentPayload = new AssignmentPayload();
	
	


}

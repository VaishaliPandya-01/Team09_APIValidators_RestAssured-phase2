package api.utilities;

import java.io.File;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import api.payload.BatchPayload;
import api.payload.ProgramPayload;
import io.restassured.response.Response;

public class RestUtils {
	
	public static ResourceBundle routes = ResourceBundle.getBundle("Routes");
	public static Logger log = LogManager.getLogger();
	
	public static ResourceBundle path =ResourceBundle.getBundle("path");
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));
	
	public static File postbatchJson = xlutils.getJSONFile(path.getString("postbatchJson"));			
	public static File getbatchbynameJson = xlutils.getJSONFile(path.getString("getbatchbynameJson"));
	public static File getbatchIDJson = xlutils.getJSONFile(path.getString("getbatchIDJson"));
	public static File updatebatchIDJson = xlutils.getJSONFile(path.getString("batchupdatebyIDJson"));
	
	public static Response response;
	
	public static ProgramPayload ProgramPayload = new ProgramPayload();
	public static BatchPayload BatchPayload = new BatchPayload();

	//public static String path =".\\src\\test\\resources\\TestData\\DataExcel.xlsx";
	//public static XLUtils xlutils=new XLUtils(path);
//	public static UserPayload UserPayload = new UserPayload();
//	public static UserRoleMap UserRoleMap = new UserRoleMap();
//	public static AssignmentPayload AssignmentPayload = new AssignmentPayload();
//	public static AssignmentSubmitPayload AssignmentSubmitPayload = new AssignmentSubmitPayload();

}

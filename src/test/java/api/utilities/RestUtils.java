package api.utilities;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.restassured.response.Response;
import api.payload.*;
import api.payload.ProgramPayload;
import api.payload.BatchPayload;
import api.payload.UserPayload;
import api.payload.UserRoleMap;
import java.io.File;

public class RestUtils {
	
	public static ResourceBundle routes = ResourceBundle.getBundle("Routes");
	public static Logger log = LogManager.getLogger();
	
	public static ResourceBundle path = ResourceBundle.getBundle("path");
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));
	public static File programPostjson = xlutils.getJSONFile(path.getString("programPostjson"));
	public static File AssignSubmitjson = xlutils.getJSONFile(path.getString("AssignSubmitjson"));
	public static File getAllUserjson= xlutils.getJSONFile(path.getString("getAllUserjson"));
	public static File getUserByIDjson= xlutils.getJSONFile(path.getString("getUserByIDjson"));
	public static File getUserByRolejson= xlutils.getJSONFile(path.getString("getUserByRolejson"));
	public static File postUserjson= xlutils.getJSONFile(path.getString("postUserjson"));
	public static File putUserByIdjson= xlutils.getJSONFile(path.getString("putUserByIdjson"));
	public static File putUserStatusRolejson= xlutils.getJSONFile(path.getString("putUserStatusRolejson"));
	public static File batchPostjson= xlutils.getJSONFile(path.getString("batchPostjson"));
	
	
	//public static String path ="D:\\Team09_APIValidators_RestAssured-phase2\\src\\test\\resources\\TestData\\DataExcel.xlsx";
	//public static XLUtils xlutils=new XLUtils(path);
	public static Response response;
	public static ProgramPayload ProgramPayload=new ProgramPayload();
	public static BatchPayload BatchPayload=new BatchPayload();
	public static UserPayload UserPayload = new UserPayload();
	public static UserRoleMap UserRoleMap = new UserRoleMap();
	public static UserWithoutRole UserWithoutRole=new UserWithoutRole();
	public static UserProgBatchIdRoleMap UserProgBatchIdRoleMap =new UserProgBatchIdRoleMap();
	public static userRoleProgramBatches userRoleProgramBatches=new userRoleProgramBatches();
	//public static UserId UserId =new UserId();
	public static String AdminUser; 
	public static String StaffUser; 
	public static String StudentUser; 

}

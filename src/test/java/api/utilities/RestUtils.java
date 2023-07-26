package api.utilities;

import java.io.File;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import api.payload.ProgramPayload;

import io.restassured.response.Response;

public class RestUtils {

	public static ResourceBundle routes = ResourceBundle.getBundle("Routes");
   public static ResourceBundle path = ResourceBundle.getBundle("path");
	
	public static XLUtils xlutils=new XLUtils(path.getString("Xlpath"));
	
	public static File programPostjson = xlutils.getJSONFile(path.getString("programPostSchemajson"));
	public static File programPutjson = xlutils.getJSONFile(path.getString("programPutSchemajson"));
	public static Logger log = LogManager.getLogger();
	public static ProgramPayload ProgramPayload = new ProgramPayload();
	
	public static Response response;
	
}

package api.requestbody;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

import api.payload.UserPayload;
import api.utilities.RestUtils;

public class UserBody extends RestUtils{
	
	@SuppressWarnings("unchecked")
	public static UserPayload AdminPostBody() {

		UserPayload.setUserComments("creating new Admin user");
		UserPayload.setUserEduPg("MS");
		UserPayload.setUserEduUg("BE");
		UserPayload.setUserFirstName("APIValidators_"+RandomStringUtils.randomNumeric(3));
		UserPayload.setUserLastName("User");
		UserPayload.setUserLinkedinUrl("www.linkedin.com/Test1234");
		UserPayload.setUserLocation("India");
		UserPayload.setUserMiddleName("");
		UserPayload.setUserPhoneNumber("3450089090");
		
		List userRoleMaps = new ArrayList<>();
        UserRoleMap.setRoleId("R01");
        UserRoleMap.setUserRoleStatus("Active");
        userRoleMaps.add(UserRoleMap);

        UserPayload.setUserRoleMaps(userRoleMaps);
		UserPayload.setUserTimeZone("IST");
		UserPayload.setUserVisaStatus("H4-EAD");
			
		return UserPayload;
	}
	
	@SuppressWarnings("unchecked")
	public static UserPayload StudentPostBody() {

		UserPayload.setUserComments("creating new Studen user");
		UserPayload.setUserEduPg("MS");
		UserPayload.setUserEduUg("BE");
		UserPayload.setUserFirstName("APIValidators_"+RandomStringUtils.randomNumeric(3));
		UserPayload.setUserLastName("User");
		UserPayload.setUserLinkedinUrl("www.linkedin.com/Test1234");
		UserPayload.setUserLocation("India");
		UserPayload.setUserMiddleName("");
		UserPayload.setUserPhoneNumber("2247748118");
		
		List userRoleMaps = new ArrayList<>();
        UserRoleMap.setRoleId("R03");
        UserRoleMap.setUserRoleStatus("Active");
        userRoleMaps.add(UserRoleMap);

        UserPayload.setUserRoleMaps(userRoleMaps);
		UserPayload.setUserTimeZone("IST");
		UserPayload.setUserVisaStatus("H4-EAD");
			
		return UserPayload;
	}

}

package api.requestbody;

import java.util.ArrayList;
import java.util.List;

import api.payload.UserPayload;
import api.utilities.RestUtils;

public class UserBody extends RestUtils{
	
	@SuppressWarnings("unchecked")
	public static UserPayload PostBody() {

		UserPayload.setUserComments("creating new Admin user");
		UserPayload.setUserEduPg("MS");
		UserPayload.setUserEduUg("BE");
		UserPayload.setUserFirstName("APIValidators_682");
		UserPayload.setUserLastName("User");
		UserPayload.setUserLinkedinUrl("www.linkedin.com/Test1234");
		UserPayload.setUserLocation("India");
		UserPayload.setUserMiddleName("");
		UserPayload.setUserPhoneNumber("1019328864");
		
		List userRoleMaps = new ArrayList<>();
        UserRoleMap.setRoleId("R01");
        UserRoleMap.setUserRoleStatus("Active");
        userRoleMaps.add(UserRoleMap);

        UserPayload.setUserRoleMaps(userRoleMaps);
		UserPayload.setUserTimeZone("IST");
		UserPayload.setUserVisaStatus("H4-EAD");
			
		return UserPayload;
	}

}

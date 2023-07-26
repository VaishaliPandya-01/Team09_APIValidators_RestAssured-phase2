package requestbody;

import java.util.ArrayList;
import java.util.List;

import payload.UserPayload;
import payload.UserRoleMap;
import utilities.RestUtils;

public class UserBody extends RestUtils{
	
	@SuppressWarnings("unchecked")
	public static UserPayload PostBody() {

		UserPayload.setUserComments("creating new Admin user");
		UserPayload.setUserEduPg("MS");
		UserPayload.setUserEduUg("BE");
		UserPayload.setUserFirstName("APIValidators_682");
		UserPayload.setUserLastName("User");
		UserPayload.setUserLinkedinUrl("www.linkedin.com/Test234");
		UserPayload.setUserLocation("India");
		UserPayload.setUserMiddleName("");
		UserPayload.setUserPhoneNumber("8778499787");
		
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

package api.POJO;

import java.util.List;

public class userPUT_ProgBatchStatus_Payload {
	
	private String programId;
	private String roleId;
	private String userId;
	private List<userRoleProgramBatches_Payload> userRoleProgramBatches;
	
	
	
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public List<userRoleProgramBatches_Payload> getUserRoleProgramBatches() {
		return userRoleProgramBatches;
	}
	public void setUserRoleProgramBatches(List<userRoleProgramBatches_Payload> userRoleProgramBatches) {
		this.userRoleProgramBatches = userRoleProgramBatches;
	}
	

}

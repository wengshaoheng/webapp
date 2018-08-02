package wsh.webapp.po.adm;

public class Role {
	
	private String roleId;
	
	private String roleDesc;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Role { roleId = ").append(roleId);
		sb.append(", roleDesc = ").append(roleDesc).append("}");
		return sb.toString();
	}

}

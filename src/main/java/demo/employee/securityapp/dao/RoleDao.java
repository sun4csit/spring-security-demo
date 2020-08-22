package demo.employee.securityapp.dao;

import demo.employee.securityapp.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);

}

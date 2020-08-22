package demo.employee.securityapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import demo.employee.securityapp.entity.User;
import demo.employee.securityapp.user.CrmUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}

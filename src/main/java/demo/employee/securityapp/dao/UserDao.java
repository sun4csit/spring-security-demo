package demo.employee.securityapp.dao;

import demo.employee.securityapp.entity.User;

public interface UserDao {

	public User findByUserName(String userName);

	public void save(User user);

}

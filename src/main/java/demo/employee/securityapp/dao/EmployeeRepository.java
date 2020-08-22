package demo.employee.securityapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.employee.securityapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();

	// search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}

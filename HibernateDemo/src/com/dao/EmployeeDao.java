package com.dao;

import com.domain.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	Employee getEmployeeById(int employeeId);

}

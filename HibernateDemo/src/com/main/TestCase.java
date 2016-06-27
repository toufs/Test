package com.main;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.domain.Employee;

public class TestCase {
	public static void main(String[] args) {
		EmployeeDao dao= new EmployeeDaoImpl();
		
		Employee employee = new Employee();
		employee.setName("Sagar33");
		employee.setSalary(450003);
		employee.setEmployeeId(52);
		
		dao.save(employee);
		//dao.delete(employee);
		
	//	employee = dao.getEmployeeById(52);
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getName());
		
		//dao.delete(employee);
	}

}

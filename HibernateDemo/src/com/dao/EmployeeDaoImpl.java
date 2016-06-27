package com.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.domain.Employee;
import com.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	public void save(Employee employee) {
		
		SessionFactory factory = HibernateUtil.getSessinFacory();
		//first level cache start...
		Session session = factory.openSession();
		//get object of connecion from connection pool..
		Transaction transaction= session.beginTransaction();
		//insert statement..
		try{
		session.save(employee);
		transaction.commit();
		}catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
				e.printStackTrace();
			}
		}finally{
			session.close();
		}
		
		
	}

	public void update(Employee employee) {
		
		SessionFactory factory = HibernateUtil.getSessinFacory();
		//first level cache start...
		Session session = factory.openSession();
		//get object of connecion from connection pool..
		Transaction transaction= session.beginTransaction();
		//insert statement..
		try{
		session.update(employee);
		transaction.commit();
		}catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
				e.printStackTrace();
			}
		}finally{
			session.close();
		}
		
		
	}

	public void delete(Employee employee) {
		
		SessionFactory factory = HibernateUtil.getSessinFacory();
		//first level cache start...
		Session session = factory.openSession();
		//get object of connecion from connection pool..
		Transaction transaction= session.beginTransaction();
		//insert statement..
		try{
		session.delete(employee);
		transaction.commit();
		
		}catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
				e.printStackTrace();
			}
		}finally{
			session.close();
		}
	
	}

	/*public Employee getEmployeeById(int employeeId) {

		
		SessionFactory factory = HibernateUtil.getSessinFacory();
		//first level cache start...
		Session session = factory.openSession();
		Employee employee=null;
		try{
			employee= (Employee) session.get(Employee.class, employeeId);
		}finally{
			session.close();
		}
		
		return employee;
	}
*/
	public Employee getEmployeeById(int employeeId) {

		
		SessionFactory factory = HibernateUtil.getSessinFacory();
		//first level cache start...
		Session session = factory.openSession();
		Employee employee=null;
		try{
			employee= (Employee) session.get(Employee.class,new Integer(employeeId));
			
			session.close();
			
			System.out.println(employee.getEmployeeId());
			System.out.println(employee.getName());
		}finally{
			//session.close();
		}
		
		System.out.println("added to check...");
		return employee;
	}

}

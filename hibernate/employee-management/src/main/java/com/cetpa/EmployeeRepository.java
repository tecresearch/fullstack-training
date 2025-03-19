package com.cetpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeRepository 
{
	private static Session session;
	private static Transaction tr;
	static
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session=factory.openSession();
		tr=session.getTransaction();
	}
	public static void saveEmployee(Employee employee)
	{
		tr.begin();
		session.persist(employee);
		tr.commit();
	}
	public static List<Employee> getList()
	{
		Query<Employee> query=session.createQuery("from Employee",Employee.class);
		List<Employee> elist=query.list();
		return elist;
	}
	public static Employee getEmployee(int eid)
	{
		Employee emp=session.get(Employee.class,eid);
		return emp;
	}
	public static void deleteEmployee(Employee employee)
	{
		tr.begin();
		session.remove(employee);
		tr.commit();
	}
	public static void updateEmployee(Employee empn)
	{
		Employee empo=session.get(Employee.class,empn.getEid());
		tr.begin();
		empo.setFirstname(empn.getFirstname());
		empo.setLastname(empn.getLastname());
		empo.setPhone(empn.getPhone());
		empo.setEmail(empn.getEmail());
		empo.setDepartment(empn.getDepartment());
		empo.setSalary(empn.getSalary());
		tr.commit();
	}
}

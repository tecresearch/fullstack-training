package com.cetpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App2 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Query<Employee> query=session.createQuery("from Employee",Employee.class);
		List<Employee> employeeList=query.list();
		for(Employee emp:employeeList)
		{
			System.out.println(emp);
		}
	}
}

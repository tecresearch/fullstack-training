package com.cetpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App5 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Query<Employee> query=session.createQuery("from Employee where name=:arg",Employee.class);
		query.setParameter("arg","Amit Singh");
		Employee emp=query.uniqueResult();
		System.out.println(emp);
	}
}

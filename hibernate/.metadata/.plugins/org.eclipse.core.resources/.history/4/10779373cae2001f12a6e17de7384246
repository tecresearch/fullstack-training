package com.cetpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		//Accessing object first time 
		Employee e1=session.get(Employee.class,101);
		System.out.println(e1);
		session.evict(e1);
		
		//Accessing same object second time 
		Employee e2=session.get(Employee.class,101);
		System.out.println(e2);

		//Accessing same object third time 
		Employee e3=session.get(Employee.class,101);
		System.out.println(e3);
	}
}

package com.cetpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session1=factory.openSession();
		Session session2=factory.openSession();
		Session session3=factory.openSession();
		//Accessing object first time from sesion1 
		Employee e1=session1.get(Employee.class,101);
		System.out.println(e1);
		
		//Accessing same object second time from sesion2 
		Employee e2=session2.get(Employee.class,101);
		System.out.println(e2);

		//Accessing same object third time  from sesion3
		Employee e3=session3.get(Employee.class,101);
		System.out.println(e3);
	}
}

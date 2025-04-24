package com.cetpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.getTransaction();
		tr.begin();
		Department d1=new Department("Sales","Ravi");
		Department d2=new Department("Marketing","Vikas");
		Department d3=new Department("Account","Vaibhav");
		session.persist(new Employee("Amit Singh","5566778899","Noida",60000,d2));
		session.persist(new Employee("Manoj Mishra","5566778899","Noida",60000,d1));
		session.persist(new Employee("Hemant Yadav","5566778899","Noida",60000,d2));
		session.persist(new Employee("Kapil Sharma","5566778899","Noida",60000,d3));
		session.persist(new Employee("Imran Ahmad","5566778899","Noida",60000,d1));
		session.persist(new Employee("Suman Singh","5566778899","Noida",60000,d2));
		session.persist(new Employee("Atul Arora","5566778899","Noida",60000,d3));
		tr.commit();
	}
}

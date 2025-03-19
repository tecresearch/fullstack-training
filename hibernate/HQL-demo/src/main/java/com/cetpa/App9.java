package com.cetpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App9 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.createQuery("delete from Employee where department=:arg");
		query.setParameter("arg","Accounts");
		Transaction tr=session.beginTransaction();
		query.executeUpdate();
		tr.commit();
	}
}

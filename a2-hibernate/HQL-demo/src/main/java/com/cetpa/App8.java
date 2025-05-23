package com.cetpa;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App8 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.createQuery("update Employee set salary=salary+:arg1 where eid=:arg2");
		query.setParameter("arg1",8000);
		query.setParameter("arg2",101);
		Transaction tr=session.beginTransaction();
		query.executeUpdate();
		tr.commit();
	}
}

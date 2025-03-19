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
		Session session=factory.openSession();
		Transaction tr=session.getTransaction();
		tr.begin();
		Person person1=new Person("Amit Singh","4455667788","Noida");
		Person person2=new Person("Manoj Mishra","9988776655","Delhi");
		Person person3=new Person("Rakesh Verma","8090706050","Luvknow");
		session.persist(new AdharCard(101,"1234-5678-1436",person1));
		session.persist(new AdharCard(102,"8888-3434-4545",person3));
		session.persist(new AdharCard(103,"4000-6789-1367",person2));
		tr.commit();
	}
}

package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class PersistingObject 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.getTransaction();
        tr.begin();
        session.persist(new Product(104,"Laptop","HP",50000));
        session.persist(new Product(105,"Mouse","Logitech",700));
        session.persist(new Product(106,"Printer","Dell",5000));
        tr.commit();
        factory.close();
    }
}

package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class GettingObject 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        Product product=session.get(Product.class,101);
        if(product!=null)
        	System.out.println(product);
        else
        	System.out.println("Record not found");
    }
}

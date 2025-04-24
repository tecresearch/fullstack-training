package com.cetpa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductRepository2 
{
    public static void main( String[] args )
    {
        //Command to create object of SessionFactory interface
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
   
 }
}

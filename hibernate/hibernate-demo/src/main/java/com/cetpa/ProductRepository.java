package com.cetpa;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductRepository 
{
    public static void main( String[] args )
    {
        //Command to create object of SessionFactory interface
    	Configuration cn=new Configuration();
    	cn.configure("hibernate.cfg.xml");
    	SessionFactory factory=cn.buildSessionFactory();
    }
}

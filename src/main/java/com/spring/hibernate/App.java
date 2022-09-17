package com.spring.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.getCurrentSession();
        
        Instructor instructor1=new Instructor("Chad","Derby");
        InstructorDetails instructorDetails1=new InstructorDetails("Love2Code");
        instructor1.setInstructorDetails(instructorDetails1);
        try {
        	 
        	 session.beginTransaction();
        	 System.out.println("Saving the object");
        	 session.save(instructor1);
        	 session.getTransaction().commit();
        }
        
       catch (Exception e) {}
        
       finally {
		session.close();
		factory.close();
       }
    }
}

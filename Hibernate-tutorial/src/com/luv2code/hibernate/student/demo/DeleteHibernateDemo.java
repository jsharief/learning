package com.luv2code.hibernate.student.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteHibernateDemo {
	
	public static void main(String[] args) {
		
		SessionFactory  factory  = null;
		
		try {
			  factory = new Configuration()
									.configure("hibernate-config.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
			Session session = factory.getCurrentSession();
			//Student student = new Student("Jalal","Sharief","sharief.jalal@gmail.com");
			
			session.beginTransaction();
			
			
		System.out.println("Session cache mode" + session.getCacheMode());	
		
		int executedQuery = session.createQuery("Delete from Student s where s.id = 6").executeUpdate();
			
		//	session.createQuery("from Student s where " );
			
	 	session.getTransaction().commit();
			
			System.out.println("completed" + executedQuery);
		} finally  {
			// TODO Auto-generated catch block
			factory.close();
		}
	}

	 

}

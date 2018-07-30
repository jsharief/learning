package com.luv2code.hibernate.student.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		SessionFactory  factory = new Configuration()
								.configure("hibernate-config.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		Student student = new Student("Jalal","Sharief","sharief.jalal@gmail.com");
		
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		
		System.out.println("completed");
	}

}

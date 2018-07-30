package com.luv2code.hibernate.student.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadHibernateDemo {
	
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
			
			Student S = session.get(Student.class, 1);
			
			System.out.println(S.getFirstName() + " " + S.getEmail());
		//	
			session.createQuery("from Student s where  )
			
			session.getTransaction().commit();
			
			System.out.println("completed");
		} finally  {
			// TODO Auto-generated catch block
			factory.close();
		}
	}

}

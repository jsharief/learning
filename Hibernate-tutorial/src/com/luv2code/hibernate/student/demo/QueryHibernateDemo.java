package com.luv2code.hibernate.student.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryHibernateDemo {
	
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
			
			
			List<Student> students = session.createQuery("from Student").list();
			
			displayStudent(students);
			
			students = session.createQuery("from Student s where s.lastName='sharief'").list();
			
			
			displayStudent(students);
			
			students = session.createQuery("from Student s where s.lastName='sharief' or firstName = 'Tabraiz Hameed' ").list();
			
			displayStudent(students);
			
			students = session.createQuery("from Student s where s.email like '%gmail.com'").list();
			
			displayStudent(students);
			
		//	session.createQuery("from Student s where " );
			
			session.getTransaction().commit();
			
			System.out.println("completed");
		} finally  {
			// TODO Auto-generated catch block
			factory.close();
		}
	}

	private static void displayStudent(List<Student> students) {
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.getEmail());
			
		}
	}

}

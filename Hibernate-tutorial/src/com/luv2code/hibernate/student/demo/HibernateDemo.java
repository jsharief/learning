package com.luv2code.hibernate.student.demo;

import java.util.ArrayList;
import java.util.List;

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
		Student student1 = new Student("Fee Hameed","Jalaludeen","hameed.f@gmail.com");
		Student student2 = new Student("Cee Hameed","Jalaludeen","hameed.c@gmail.com");
		Student student3 = new Student("Dee Hameed","Jalaludeen","hameed.d@gmail.com");
		Student student4 = new Student("Kee Hameed","Jalaludeen","hameed.k@gmail.com");
		Student student5 = new Student("Gee Hameed","Jalaludeen","hameed.g@gmail.com");
		
		List<Student> students = new ArrayList();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		
		
		
		session.beginTransaction();
		
		for (Student student : students) {
			session.save(student);
		}
		
		
		
		session.getTransaction().commit();
		
		System.out.println("completed");
		
		session.close();
	}

}

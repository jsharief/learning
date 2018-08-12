package com.luv2code.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {
	
	public static void main(String[] args) {
		
		SessionFactory  factory = new Configuration()
								.configure("hibernate-config.xml")
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Instructor.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		Instructor instructor1 = new Instructor("Fee Hameed","Jalaludeen","hameed.f@gmail.com");
		Instructor instructor2 = new Instructor("Cee Hameed","Jalaludeen","hameed.c@gmail.com");
		Instructor instructor3 = new Instructor("Dee Hameed","Jalaludeen","hameed.d@gmail.com");
		Instructor student4 = new Instructor("Kee Hameed","Jalaludeen","hameed.k@gmail.com");
		Instructor student5 = new Instructor("Gee Hameed","Jalaludeen","hameed.g@gmail.com");
		
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

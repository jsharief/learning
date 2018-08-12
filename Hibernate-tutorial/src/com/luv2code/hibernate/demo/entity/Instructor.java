package com.luv2code.hibernate.demo.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="instructor")
public class Instructor {
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	@Column(name ="first_name")
	
	private String firstName;
	
	@Column(name ="last_name")
	
	private String lastName;
	
	
	@Column(name ="email")
	
	private String email;
	
	@OneToOne
	@JoinColumn(name="instructor_detail_id")
	private InstructorDetail instructorDetail;

	public Instructor(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	
	

}

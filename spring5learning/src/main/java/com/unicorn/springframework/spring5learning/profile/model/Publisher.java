package com.unicorn.springframework.spring5learning.profile.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@EntityScan("com.unicorn.springframework.spring5learning.profile.model")
public class Publisher {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	Long id;
	
	String publisherName;
	 
	public Publisher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param pId the id to set
	 */
	public void setId(Long pId) {
		id = pId;
	}

	/**
	 * @return the publisherName
	 */
	public String getPublisherName() {
		return publisherName;
	}

	/**
	 * @param pPublisherName the publisherName to set
	 */
	public void setPublisherName(String pPublisherName) {
		publisherName = pPublisherName;
	}

	/**
	 * @return the books
	 */
	
	
	 
	
	

}

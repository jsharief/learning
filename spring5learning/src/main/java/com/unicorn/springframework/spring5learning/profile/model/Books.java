package com.unicorn.springframework.spring5learning.profile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@EntityScan("com.unicorn.springframework.spring5learning.profile.model")
public class Books {

	
	String isbn;
	
	String title;
	
	@OneToOne
	Publisher publisher; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	
	public Books() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}


	/**
	 * @param pIsbn the isbn to set
	 */
	public void setIsbn(String pIsbn) {
		isbn = pIsbn;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param pTitle the title to set
	 */
	public void setTitle(String pTitle) {
		title = pTitle;
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
	 * @return the publisher
	 */
	public Publisher getPublisher() {
		return publisher;
	}


	/**
	 * @param pPublisher the publisher to set
	 */
	public void setPublisher(Publisher pPublisher) {
		publisher = pPublisher;
	}
	
	
	
	
	
//	String 
	
}

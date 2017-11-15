package com.unicorn.springframework.spring5learning.profile.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@EntityScan("com.unicorn.springframework.spring5learning.profile.model")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long profileId;
	
	private String firstName;
	
	private String lastName;
	
	private String customerNumber;
	
	@OneToMany
	private List<Books> favoriteBooks = new ArrayList<Books>();
	
	@OneToOne
	private Store preferredStore;
	
	@OneToMany
	private List<Address> addresses = new ArrayList<Address>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the profileId
	 */
	public Long getProfileId() {
		return profileId;
	}

	/**
	 * @param pProfileId the profileId to set
	 */
	public void setProfileId(Long pProfileId) {
		profileId = pProfileId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param pFirstName the firstName to set
	 */
	public void setFirstName(String pFirstName) {
		firstName = pFirstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param pLastName the lastName to set
	 */
	public void setLastName(String pLastName) {
		lastName = pLastName;
	}

	/**
	 * @return the customerNumber
	 */
	public String getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param pCustomerNumber the customerNumber to set
	 */
	public void setCustomerNumber(String pCustomerNumber) {
		customerNumber = pCustomerNumber;
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * @param pAddresses the addresses to set
	 */
	public void setAddresses(List<Address> pAddresses) {
		addresses = pAddresses;
	}

	/**
	 * @return the preferredStore
	 */
	public Store getPreferredStore() {
		return preferredStore;
	}

	/**
	 * @param pPreferredStore the preferredStore to set
	 */
	public void setPreferredStore(Store pPreferredStore) {
		preferredStore = pPreferredStore;
	}

	/**
	 * @return the favoriteBooks
	 */
	public List<Books> getFavoriteBooks() {
		return favoriteBooks;
	}

	/**
	 * @param pFavoriteBooks the favoriteBooks to set
	 */
	public void setFavoriteBooks(List<Books> pFavoriteBooks) {
		favoriteBooks = pFavoriteBooks;
	}
	
	
	
	

}

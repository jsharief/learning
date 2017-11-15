package com.unicorn.springframework.spring5learning.profile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@EntityScan("com.unicorn.springframework.spring5learning.profile.model")
public class Address {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Long addressId;
	
	private String nickName;
	
	private String firstName;
	
	private String lastName;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipCode;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}


	/**
	 * @param pAddressId the addressId to set
	 */
	public void setAddressId(Long pAddressId) {
		addressId = pAddressId;
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
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}


	/**
	 * @param pAddressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String pAddressLine1) {
		addressLine1 = pAddressLine1;
	}


	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}


	/**
	 * @param pAddressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String pAddressLine2) {
		addressLine2 = pAddressLine2;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param pCity the city to set
	 */
	public void setCity(String pCity) {
		city = pCity;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param pState the state to set
	 */
	public void setState(String pState) {
		state = pState;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param pCountry the country to set
	 */
	public void setCountry(String pCountry) {
		country = pCountry;
	}


	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}


	/**
	 * @param pZipCode the zipCode to set
	 */
	public void setZipCode(String pZipCode) {
		zipCode = pZipCode;
	}


	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}


	/**
	 * @param pNickName the nickName to set
	 */
	public void setNickName(String pNickName) {
		nickName = pNickName;
	}
	
	
	
	

}

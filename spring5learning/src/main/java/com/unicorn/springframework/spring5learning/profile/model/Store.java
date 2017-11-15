package com.unicorn.springframework.spring5learning.profile.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@EntityScan("com.unicorn.springframework.spring5learning.profile.model")
public class Store {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String storeName;
	
	private String storeNumber;
	
	private double latitude;
	
	private double longitute;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipCode;
	
	@ElementCollection
	@CollectionTable(name = "storeHours") 
	List<String> storeHours = new ArrayList<String>();
	

	
	
	
	public Store() {
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
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}


	/**
	 * @param pStoreName the storeName to set
	 */
	public void setStoreName(String pStoreName) {
		storeName = pStoreName;
	}


	/**
	 * @return the storeNumber
	 */
	public String getStoreNumber() {
		return storeNumber;
	}


	/**
	 * @param pStoreNumber the storeNumber to set
	 */
	public void setStoreNumber(String pStoreNumber) {
		storeNumber = pStoreNumber;
	}


	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}


	/**
	 * @param pLatitude the latitude to set
	 */
	public void setLatitude(double pLatitude) {
		latitude = pLatitude;
	}


	/**
	 * @return the longitute
	 */
	public double getLongitute() {
		return longitute;
	}


	/**
	 * @param pLongitute the longitute to set
	 */
	public void setLongitute(double pLongitute) {
		longitute = pLongitute;
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
	 * @return the storeHours
	 */
	public List<String> getStoreHours() {
		return storeHours;
	}


	/**
	 * @param pStoreHours the storeHours to set
	 */
	public void setStoreHours(List<String> pStoreHours) {
		storeHours = pStoreHours;
	}
	
	
	

}

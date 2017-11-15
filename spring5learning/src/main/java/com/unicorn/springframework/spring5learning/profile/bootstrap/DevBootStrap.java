package com.unicorn.springframework.spring5learning.profile.bootstrap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.unicorn.springframework.spring5learning.profile.model.Address;
import com.unicorn.springframework.spring5learning.profile.model.Books;
import com.unicorn.springframework.spring5learning.profile.model.Customer;
import com.unicorn.springframework.spring5learning.profile.model.Publisher;
import com.unicorn.springframework.spring5learning.profile.model.Store;
import com.unicorn.springframework.spring5learning.profile.repositories.AddressRepository;
import com.unicorn.springframework.spring5learning.profile.repositories.BookRepository;
import com.unicorn.springframework.spring5learning.profile.repositories.ProfileRepository;
import com.unicorn.springframework.spring5learning.profile.repositories.PublisherRepository;
import com.unicorn.springframework.spring5learning.profile.repositories.StoreRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	 AddressRepository addrRepository;
	 BookRepository bookRepository;
	 ProfileRepository profileRepository;
	 StoreRepository storeRepository;
	 PublisherRepository publisherRepository;
	 
	 public DevBootStrap(AddressRepository pAddressRepository ,BookRepository pBookRepository, ProfileRepository pProfileRepository,StoreRepository pStoreRepository,PublisherRepository pPublisherRepository) {
		// TODO Auto-generated constructor stub
		 
		 addrRepository = pAddressRepository;
		 bookRepository = pBookRepository;
		 profileRepository = pProfileRepository;
		 storeRepository = pStoreRepository;
		 publisherRepository = pPublisherRepository;
	 }
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent pCRE) {
		// TODO Auto-generated method stub
		loadInitialData();
	}

	
	public void loadInitialData() {
		
		Address home = new Address();
		home.setAddressLine1("77 Rosewood Terrace");
		home.setCity("EastRutherford");
		home.setState("NJ");
		home.setCountry("USA");
		home.setZipCode("07073");
		
		addrRepository.save(home);
		
		Address office = new Address();
		office.setAddressLine1("one meadowlands plaza");
		office.setCity("EastRutherford");
		office.setState("NJ");
		office.setCountry("USA");
		office.setZipCode("07073");
	
		addrRepository.save(office);
		
		Store store1 = new Store();
		store1.setStoreName("Unicorn Book Store");
		store1.setCity("New York");
		store1.setState("New York");
		store1.setStoreNumber("U11123");
		store1.getStoreHours().add("Mon - Fri 10 AM - 9 PM ");
		store1.getStoreHours().add("Sat	  10 AM - 8 PM ");
		store1.getStoreHours().add("Sun - 11 AM - 6 PM ");
		
		storeRepository.save(store1);
		
		
		
		
		Publisher rox = new Publisher();
		rox.setPublisherName("Rox Publications");
		publisherRepository.save(rox);
		
		
		Books java1 = new Books();
		java1.setIsbn("JB11123");
		java1.setTitle("Dream about Java");
		java1.setPublisher(rox);
		bookRepository.save(java1);
				
		
		Customer jalal = new Customer();
		jalal.setCustomerNumber("11123");
		jalal.setFirstName("Jalaludeen");
		jalal.setLastName("Hameed Sharief");
		
		jalal.getAddresses().add(home);
		jalal.getAddresses().add(office);
		
		jalal.setPreferredStore(store1);
		jalal.getFavoriteBooks().add(java1);
		
		profileRepository.save(jalal);
		
		
	}
}

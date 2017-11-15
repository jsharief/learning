package com.unicorn.springframework.spring5learning.profile.repositories;

import org.springframework.data.repository.CrudRepository;

import com.unicorn.springframework.spring5learning.profile.model.Customer;

public interface ProfileRepository extends CrudRepository<Customer, Long> {

}

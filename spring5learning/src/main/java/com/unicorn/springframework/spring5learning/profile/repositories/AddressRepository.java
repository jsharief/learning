package com.unicorn.springframework.spring5learning.profile.repositories;

import org.springframework.data.repository.CrudRepository;

import com.unicorn.springframework.spring5learning.profile.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}

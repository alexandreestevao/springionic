package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevao.springionic.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

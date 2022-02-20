package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevao.springionic.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

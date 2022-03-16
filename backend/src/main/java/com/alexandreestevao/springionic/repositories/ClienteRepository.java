package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevao.springionic.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}

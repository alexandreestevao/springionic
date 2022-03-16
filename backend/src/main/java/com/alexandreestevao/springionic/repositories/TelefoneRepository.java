package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandreestevao.springionic.entities.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {

}

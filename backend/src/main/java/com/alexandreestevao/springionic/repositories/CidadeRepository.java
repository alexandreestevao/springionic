package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevao.springionic.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}

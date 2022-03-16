package com.alexandreestevao.springionic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandreestevao.springionic.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	List<Produto> findAll();

}

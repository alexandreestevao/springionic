package com.alexandreestevao.springionic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.entities.Produto;
import com.alexandreestevao.springionic.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	@Transactional(readOnly = true)
	public List<Produto> findAll() {
		List<Produto> list = repo.findAll();
		return list;
	}

}

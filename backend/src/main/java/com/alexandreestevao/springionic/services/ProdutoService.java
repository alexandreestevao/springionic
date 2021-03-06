package com.alexandreestevao.springionic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.entities.Produto;
import com.alexandreestevao.springionic.repositories.ProdutoRepository;
import com.alexandreestevao.springionic.services.exceptions.ObjectNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
	@Transactional(readOnly = true)
	public List<Produto> find() {
		List<Produto> list = repo.findAll();
		return list;
	}
	
	@Transactional(readOnly = true)
	public Produto findById(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
	}

}

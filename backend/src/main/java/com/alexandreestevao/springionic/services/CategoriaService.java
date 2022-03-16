package com.alexandreestevao.springionic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.entities.Categoria;
import com.alexandreestevao.springionic.repositories.CategoriaRepository;
import com.alexandreestevao.springionic.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		List<Categoria> list = repo.findAll();
		return list;
	}

	@Transactional(readOnly = true)
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}

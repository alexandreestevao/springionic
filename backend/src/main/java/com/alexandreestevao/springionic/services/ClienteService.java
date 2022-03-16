package com.alexandreestevao.springionic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.entities.Cliente;
import com.alexandreestevao.springionic.repositories.ClienteRepository;
import com.alexandreestevao.springionic.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		List<Cliente> list = repo.findAll();
		return list;
	}

	@Transactional(readOnly = true)
	public Cliente findById(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Cliente.class.getName()));

	}

}

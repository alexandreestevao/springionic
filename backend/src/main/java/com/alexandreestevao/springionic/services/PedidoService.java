package com.alexandreestevao.springionic.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.entities.Pedido;
import com.alexandreestevao.springionic.repositories.PedidoRepository;
import com.alexandreestevao.springionic.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	@Transactional(readOnly = true)
	public List<Pedido> find() {
		List<Pedido> list = repo.findAll();
		return list;
	}

	@Transactional(readOnly = true)
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}

}

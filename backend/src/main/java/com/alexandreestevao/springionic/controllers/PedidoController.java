package com.alexandreestevao.springionic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandreestevao.springionic.entities.Pedido;
import com.alexandreestevao.springionic.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService service;

	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		List<Pedido> list = service.find();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Pedido> findById(@PathVariable Integer id) {
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}

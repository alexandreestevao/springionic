package com.alexandreestevao.springionic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandreestevao.springionic.entities.Cliente;
import com.alexandreestevao.springionic.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		List<Cliente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> findById(@PathVariable Integer id){
		Cliente obj = service.findById(id);
	   return ResponseEntity.ok().body(obj); 
	}

}

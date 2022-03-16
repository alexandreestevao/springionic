package com.alexandreestevao.springionic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandreestevao.springionic.entities.Categoria;
import com.alexandreestevao.springionic.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService service;

	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		List<Categoria> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Categoria> findById(@PathVariable Integer id){
		Categoria obj = service.findById(id);
	   return ResponseEntity.ok().body(obj); 
	}

}

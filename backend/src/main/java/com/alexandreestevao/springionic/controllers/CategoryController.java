package com.alexandreestevao.springionic.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexandreestevao.springionic.dto.CategoryDTO;
import com.alexandreestevao.springionic.entities.Category;
import com.alexandreestevao.springionic.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll() {
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<?> findById(@PathVariable long id){
		Optional<Category> obj = service.findById(id);
	   return ResponseEntity.ok().body(obj); 
	}

}

package com.alexandreestevao.springionic.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.dto.CategoryDTO;
import com.alexandreestevao.springionic.entities.Category;
import com.alexandreestevao.springionic.repositories.CategoryRepository;
import com.alexandreestevao.springionic.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> list = repo.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Optional<Category> findById(Long id) {
		Optional<Category> obj = repo.findById(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Object not found! Id: " + id
					+ ", Tipo: " + Category.class.getName());
		}
		return obj;
	}

}

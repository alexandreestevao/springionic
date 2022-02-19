package com.alexandreestevao.springionic.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandreestevao.springionic.dto.ProductDTO;
import com.alexandreestevao.springionic.entities.Product;
import com.alexandreestevao.springionic.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> list = repo.findAll();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

}

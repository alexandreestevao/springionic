package com.alexandreestevao.springionic.dto;

import java.io.Serializable;

import com.alexandreestevao.springionic.entities.Category;

public class CategoryDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	//private List<ProductDTO> products = new ArrayList<>();
	
	public CategoryDTO() {		
	}

	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<ProductDTO> getProducts() {
//		return products;
//	}
	
}
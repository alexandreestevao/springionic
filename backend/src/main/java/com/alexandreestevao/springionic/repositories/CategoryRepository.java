package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandreestevao.springionic.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

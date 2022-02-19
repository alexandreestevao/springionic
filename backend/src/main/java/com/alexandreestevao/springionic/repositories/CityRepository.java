package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevao.springionic.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {

}

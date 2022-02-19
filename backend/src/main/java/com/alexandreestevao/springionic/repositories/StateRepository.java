package com.alexandreestevao.springionic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevao.springionic.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}

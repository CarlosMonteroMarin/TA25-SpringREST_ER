package com.TA25_EJ1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TA25_EJ1.dto.Articulos;

public interface IArticulosDAO extends JpaRepository<Articulos, Integer> {

}

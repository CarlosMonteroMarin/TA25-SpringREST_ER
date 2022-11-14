package com.TA25_EJ2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TA25_EJ2.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{

}

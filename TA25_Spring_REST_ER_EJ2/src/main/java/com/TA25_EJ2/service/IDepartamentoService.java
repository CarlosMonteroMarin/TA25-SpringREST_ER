package com.TA25_EJ2.service;

import java.util.List;

import com.TA25_EJ2.dto.Departamento;

public interface IDepartamentoService {

	public List<Departamento> listarDepartamento();
	
	public Departamento guardarDepartamento(Departamento departamento);	
	
	public Departamento departamentoXID(Long id); 
	
	public Departamento actualizarDepartamento(Departamento departamento); 
	
	public void eliminarDepartamento(Long id);
	
	
}

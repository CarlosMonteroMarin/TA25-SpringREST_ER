package com.TA25_EJ3.service;

import java.util.List;

import com.TA25_EJ3.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listarAlmacen();
	
	public Almacen guardarAlmacen(Almacen almacen);	
	
	public Almacen almacenXID(Long id); 
	
	public Almacen actualizarAlmacen(Almacen almacen); 
	
	public void eliminarAlmacen(Long id);
	
	
}

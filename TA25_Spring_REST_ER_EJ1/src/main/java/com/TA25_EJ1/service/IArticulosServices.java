package com.TA25_EJ1.service;

import java.util.List;

import com.TA25_EJ1.dto.Articulos;

public interface IArticulosServices {
	public List<Articulos> listarArticulo();
	
	public Articulos guardarArticulo(Articulos articulo);
	
	public Articulos articuloXID(int id);
	
	public Articulos actualizarArticulo(Articulos articulo);
	
	public void eliminarArticulo(int id);
}

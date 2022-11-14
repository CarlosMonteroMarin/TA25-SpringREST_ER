package com.TA25_EJ1.service;

import java.util.List;

import com.TA25_EJ1.dto.Fabricantes;


public interface IFabricantesServices {
public List<Fabricantes> listarFabricantes();
	
	public Fabricantes guardarFabricante(Fabricantes fabricante);
	
	public Fabricantes fabricanteXID(int id);
	
	public Fabricantes actualizarFabricante(Fabricantes fabricante);
	
	public void eliminarFabricante(int id);
}

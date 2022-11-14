package com.TA25_EJ1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.TA25_EJ1.dao.IFabricantesDAO;
import com.TA25_EJ1.dto.Fabricantes;


@Service
public class FabricantesServiceImpl implements IFabricantesServices{

	IFabricantesDAO iFabricantesDAO;
	@Override
	public List<Fabricantes> listarFabricantes() {
		
		return iFabricantesDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {
		
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public Fabricantes fabricanteXID(int id) {
		
		return iFabricantesDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		
		return iFabricantesDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int id) {
		iFabricantesDAO.deleteById(id);

	}
}

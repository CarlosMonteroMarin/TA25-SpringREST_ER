package com.TA25_EJ1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA25_EJ1.dao.IArticulosDAO;
import com.TA25_EJ1.dto.Articulos;

@Service
public class ArticulosServiceImpl  implements IArticulosServices {
	
	@Autowired
	IArticulosDAO iArticuloDAO;
	
	@Override
	public List<Articulos> listarArticulo() {
		
		return iArticuloDAO.findAll();
	}
	
	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulos articuloXID(int id) {
		
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int id) {
		
		iArticuloDAO.deleteById(id);
		
	}

}
	


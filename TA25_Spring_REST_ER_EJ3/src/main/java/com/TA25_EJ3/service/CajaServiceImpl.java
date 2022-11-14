package com.TA25_EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA25_EJ3.dao.ICajaDAO;
import com.TA25_EJ3.dto.Caja;


@Service
public class CajaServiceImpl implements ICajaService{
	
	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCaja() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(Long id) {
		
		return iCajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(Long id) {
		
		iCajaDAO.deleteById(id);
		
	}

}

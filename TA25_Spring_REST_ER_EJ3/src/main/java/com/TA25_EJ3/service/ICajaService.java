package com.TA25_EJ3.service;

import java.util.List;

import com.TA25_EJ3.dto.Caja;

public interface ICajaService {

		public List<Caja> listarCaja();
		
		public Caja guardarCaja(Caja caja);
		
		public Caja cajaXID(Long id);
		
		public Caja actualizarCaja(Caja caja); 
		
		public void eliminarCaja(Long id);
}

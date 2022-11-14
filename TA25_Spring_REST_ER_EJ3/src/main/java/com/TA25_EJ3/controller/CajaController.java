package com.TA25_EJ3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TA25_EJ3.dto.Caja;
import com.TA25_EJ3.service.CajaServiceImpl;


@RestController
@RequestMapping("/api")
public class CajaController {
	
	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listarCaja(){
		return cajaServiceImpl.listarCaja();
	}
	
	@PostMapping("/cajas")
	public Caja salvarCaja(@RequestBody Caja caja) {
		
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@GetMapping("/caja/{id}")
	public Caja cajaXID(@PathVariable(name="id") Long id) {
		
		Caja caja_xid= new Caja();
		
		caja_xid=cajaServiceImpl.cajaXID(id);
		
		
		return caja_xid;
	}
	
	@PutMapping("/caja/{id}")
	public Caja actualizarCaja(@PathVariable(name="id")Long id,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServiceImpl.cajaXID(id);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaServiceImpl.actualizarCaja(caja_seleccionado);
		
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/caja/{id}")
	public void eleiminarCaja(@PathVariable(name="id")Long id) {
		cajaServiceImpl.eliminarCaja(id);
	}
	
	
}

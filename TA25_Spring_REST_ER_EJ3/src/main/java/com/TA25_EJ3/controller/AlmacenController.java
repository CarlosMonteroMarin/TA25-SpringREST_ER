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

import com.TA25_EJ3.dto.Almacen;
import com.TA25_EJ3.service.AlmacenServiceImpl;


@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacen(){
		return almacenServiceImpl.listarAlmacen();
	}
	
	@PostMapping("/almacenes")
	public Almacen salvarAlmacen(@RequestBody Almacen almacen) {
		
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacen/{id}")
	public Almacen almacenXID(@PathVariable(name="id") Long id) {
		
		Almacen almacen_xid= new Almacen();
		
		almacen_xid=almacenServiceImpl.almacenXID(id);
				
		return almacen_xid;
	}
	
	@PutMapping("/almacen/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenServiceImpl.almacenXID(id);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacen/{id}")
	public void eliminarAlmacen(@PathVariable(name="id")Long id) {
		almacenServiceImpl.eliminarAlmacen(id);
	}
	
}

package com.TA25_EJ1.controller;

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

import com.TA25_EJ1.dto.Fabricantes;
import com.TA25_EJ1.service.FabricantesServiceImpl;


@RestController
@RequestMapping("/api")
public class FabricantesController  {
	
	@Autowired
	FabricantesServiceImpl fabricantesServideImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabricantesServideImpl.listarFabricantes();
	}

	
	@PostMapping("/fabricantes")
	public Fabricantes salvarFabricante(@RequestBody Fabricantes fabricante) {
		
		return fabricantesServideImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricantes fabricanteXID(@PathVariable(name="id") int id) {
		
		Fabricantes fabricante_xid= new Fabricantes();
		
		fabricante_xid=fabricantesServideImpl.fabricanteXID(id);
				
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarFabricante(@PathVariable(name="id")int id,@RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado= new Fabricantes();
		Fabricantes fabricante_actualizado= new Fabricantes();
		
		fabricante_seleccionado= fabricantesServideImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricantesServideImpl.actualizarFabricante(fabricante_seleccionado);
		
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarFabricante(@PathVariable(name="id")int id) {
		fabricantesServideImpl.eliminarFabricante(id);
		}
	}

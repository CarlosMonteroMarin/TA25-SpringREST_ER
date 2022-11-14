package com.TA25_EJ2.controller;

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

import com.TA25_EJ2.dto.Departamento;
import com.TA25_EJ2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarVideos(){
		return departamentoServideImpl.listarDepartamento();
	}
	
	@PostMapping("/departamentos")
	public Departamento salvarVideo(@RequestBody Departamento departamento) {
		
		return departamentoServideImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamento/{id}")
	public Departamento videoXID(@PathVariable(name="id") Long id) {
		
		Departamento departamento_xid= new Departamento();
		
		departamento_xid=departamentoServideImpl.departamentoXID(id);
				
		return departamento_xid;
	}
	
	@PutMapping("/departamento/{id}")
	public Departamento actualizarVideo(@PathVariable(name="id")Long id,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= new Departamento();
		Departamento departamento_actualizado= new Departamento();
		
		departamento_seleccionado= departamentoServideImpl.departamentoXID(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServideImpl.actualizarDepartamento(departamento_seleccionado);
		
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamento/{id}")
	public void eliminarVideo(@PathVariable(name="id")Long id) {
		departamentoServideImpl.eliminarDepartamento(id);
	}
	
}

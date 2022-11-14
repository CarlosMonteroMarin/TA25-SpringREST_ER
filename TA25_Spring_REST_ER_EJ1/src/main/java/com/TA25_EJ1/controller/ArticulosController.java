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

import com.TA25_EJ1.dto.Articulos;
import com.TA25_EJ1.service.ArticulosServiceImpl;


@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	ArticulosServiceImpl articulosServideImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articulosServideImpl.listarArticulo();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulos(@RequestBody Articulos articulo) {
		
		return articulosServideImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos articuloXID(@PathVariable(name="id") int id) {
		
		Articulos articulo_xid= new Articulos();
		
		articulo_xid=articulosServideImpl.articuloXID(id);
				
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarArticulo(@PathVariable(name="id")int id,@RequestBody Articulos articulo) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articulosServideImpl.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setCodigo(articulo.getCodigo());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articulosServideImpl.actualizarArticulo(articulo_seleccionado);
				
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eleiminarCliente(@PathVariable(name="id")int id) {
		articulosServideImpl.eliminarArticulo(id);
		}	
	}


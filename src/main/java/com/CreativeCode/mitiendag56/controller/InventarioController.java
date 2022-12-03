package com.CreativeCode.mitiendag56.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.CreativeCode.mitiendag56.models.entity.Inventario;
import com.CreativeCode.mitiendag56.models.service.IInventarioService;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class InventarioController {
	
	@Autowired
	private IInventarioService inventarioService;
	@GetMapping("/inventarios")
	public List<Inventario> index(){
		return inventarioService.findAll();
	}
	
	@GetMapping("/inventarios/{id}")
	public Inventario show(@PathVariable String id) {
		return inventarioService.findById(id);
	}
		
	@PostMapping("/inventarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Inventario create(@RequestBody Inventario inventario) {
		return inventarioService.save(inventario);
	}
	
	@DeleteMapping("/inventarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		inventarioService.delete(id);
	}
	
	
	@PutMapping("/inventarios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Inventario update(@RequestBody Inventario datos,@PathVariable String id) {
		Inventario inventarioActual = inventarioService.findById(id);
		inventarioActual.setCantidad(datos.getCantidad());
		inventarioActual.setCodinv(id);
		inventarioActual.setIdProductoFk(datos.getIdProductoFk());
		inventarioActual.setStockmax(datos.getStockmax());
		inventarioActual.setStockmin(datos.getStockmin());
		return inventarioService.save(inventarioActual);
	}

}

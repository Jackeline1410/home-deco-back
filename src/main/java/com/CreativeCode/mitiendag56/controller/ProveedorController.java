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

import com.CreativeCode.mitiendag56.models.entity.Proveedor;
import com.CreativeCode.mitiendag56.models.service.IProveedorService;



@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class ProveedorController {

	@Autowired
	private IProveedorService proveedorService;
	
	@GetMapping("/proveedores")
	public List<Proveedor> index(){
		return proveedorService.findAll();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedor show(@PathVariable String id) {
		return proveedorService.findById(id);
	}
		
	@PostMapping("/proveedores")
	@ResponseStatus(HttpStatus.CREATED)
	public Proveedor create(@RequestBody Proveedor proveedor) {
		return proveedorService.save(proveedor);
	}
	
	@DeleteMapping("/proveedores/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		proveedorService.delete(id);
	}
	
	
	@PutMapping("/proveedores/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Proveedor update(@RequestBody Proveedor datos,@PathVariable String id) {
		Proveedor proveedorActual = proveedorService.findById(id);
		proveedorActual.setNombre(datos.getNombre());
		proveedorActual.setApellido(datos.getApellido());
		proveedorActual.setIdCiud(datos.getIdCiud());
		proveedorActual.setFechaRegistro(datos.getFechaRegistro());
		return proveedorService.save(proveedorActual);
	}
}

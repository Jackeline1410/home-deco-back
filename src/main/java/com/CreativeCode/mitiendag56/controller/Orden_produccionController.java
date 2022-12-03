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

import com.CreativeCode.mitiendag56.models.entity.Orden_produccion;
import com.CreativeCode.mitiendag56.models.service.IOrden_produccionService;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class Orden_produccionController {

	@Autowired
	private IOrden_produccionService orden_produccionService;
	@GetMapping("/ordenes_produccion")
	public List<Orden_produccion> index(){
		return orden_produccionService.findAll();
	}
	
	@GetMapping("/ordenes_produccion/{id}")
	public Orden_produccion show(@PathVariable String id) {
		return orden_produccionService.findById(id);
	}
		
	@PostMapping("/ordenes_produccion")
	@ResponseStatus(HttpStatus.CREATED)
	public Orden_produccion create(@RequestBody Orden_produccion orden_produccion) {
		return orden_produccionService.save(orden_produccion);
	}
	
	@DeleteMapping("/ordenes_produccion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		orden_produccionService.delete(id);
	}
	
	@PutMapping("/ordenes_produccion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Orden_produccion update(@RequestBody Orden_produccion datos,@PathVariable String id) {
		Orden_produccion orden_produccionActual = orden_produccionService.findById(id);
		orden_produccionActual.setFecha_registro(datos.getFecha_registro());
		orden_produccionActual.setId_cliente(datos.getId_cliente());
		orden_produccionActual.setId_empleado(datos.getId_empleado());
		return orden_produccionService.save(orden_produccionActual);
	}
}

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

import com.CreativeCode.mitiendag56.models.entity.Ubicacion;
import com.CreativeCode.mitiendag56.models.service.IUbicacionService;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class UbicacionController {

	@Autowired
	private IUbicacionService ubicacionService;
	@GetMapping("/ubicaciones")
	public List<Ubicacion> index(){
		return ubicacionService.findAll();
	}
	
	@GetMapping("/ubicaciones/{id}")
	public Ubicacion show(@PathVariable String id) {
		return ubicacionService.findById(id);
	}
		
	@PostMapping("/ubicaciones")
	@ResponseStatus(HttpStatus.CREATED)
	public Ubicacion create(@RequestBody Ubicacion ubicacion) {
		return ubicacionService.save(ubicacion);
	}
	
	@DeleteMapping("/ubicaciones/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		ubicacionService.delete(id);
	}
	
	
	@PutMapping("/ubicaciones/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ubicacion update(@RequestBody Ubicacion datos,@PathVariable String id) {
		Ubicacion ubicacionActual = ubicacionService.findById(id);
		ubicacionActual.setNombre(datos.getNombre());
		return ubicacionService.save(ubicacionActual);
	}
}

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

import com.CreativeCode.mitiendag56.models.entity.Ciudad;
import com.CreativeCode.mitiendag56.models.service.ICiudadService;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class CiudadController {
	
	@Autowired
	private ICiudadService ciudadService;
	@GetMapping("/ciudades")
	public List<Ciudad> index(){
		return ciudadService.findAll();
	}
	
	@GetMapping("/ciudades/{id}")
	public Ciudad show(@PathVariable String id) {
		return ciudadService.findById(id);
	}
		
	@PostMapping("/ciudades")
	@ResponseStatus(HttpStatus.CREATED)
	public Ciudad create(@RequestBody Ciudad ciudad) {
		return ciudadService.save(ciudad);
	}
	
	@DeleteMapping("/ciudades/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		ciudadService.delete(id);
	}
	
	
	@PutMapping("/ciudades/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ciudad update(@RequestBody Ciudad datos,@PathVariable String id) {
		Ciudad ciudadActual = ciudadService.findById(id);
		ciudadActual.setNombre(datos.getNombre());
		ciudadActual.setIdDepFk(datos.getIdDepFk());
		return ciudadService.save(ciudadActual);
	}
	
}

	

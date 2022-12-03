package com.CreativeCode.mitiendag56.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.http.HttpStatus;

import com.CreativeCode.mitiendag56.models.entity.Pais;
import com.CreativeCode.mitiendag56.models.service.IPaisService;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class PaisController {
	@Autowired
	private IPaisService paisService;
	@GetMapping("/paises")
	public List<Pais> index(){
		return paisService.findAll();
	}
	
	@GetMapping("/paises/{id}")
	public Pais show(@PathVariable String id) {
		return paisService.findById(id);
	}
		
	@PostMapping("/paises")
	@ResponseStatus(HttpStatus.CREATED)
	public Pais create(@RequestBody Pais pais) {
		return paisService.save(pais);
	}
	
	@DeleteMapping("/paises/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		paisService.delete(id);
	}
	
	
	@PutMapping("/paises/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Pais update(@RequestBody Pais datos,@PathVariable String id) {
		Pais paisActual = paisService.findById(id);
		paisActual.setNombre(datos.getNombre());
		return paisService.save(paisActual);
	}
	
}
	
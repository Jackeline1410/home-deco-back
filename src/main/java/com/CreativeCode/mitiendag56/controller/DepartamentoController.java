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

import com.CreativeCode.mitiendag56.models.entity.Departamento;
import com.CreativeCode.mitiendag56.models.service.IDepartamentoService;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")
public class DepartamentoController {
	@Autowired
	private IDepartamentoService departamentoService;
	@GetMapping("/departamentos")
	public List<Departamento> index(){
		return departamentoService.findAll();
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento show(@PathVariable String id) {
		return departamentoService.findById(id);
	}
	
	@GetMapping("/departamentosByPais/{id}")
	public List<Departamento> showByPais(@PathVariable String id) {
		return departamentoService.findByidPaisDepFk(id);
	}
	
		
	@PostMapping("/departamentos")
	@ResponseStatus(HttpStatus.CREATED)
	public Departamento create(@RequestBody Departamento departamento) {
		return departamentoService.save(departamento);
	}
	
	@DeleteMapping("/departamentos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		departamentoService.delete(id);
	}
	
	
	@PutMapping("/departamentos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Departamento update(@RequestBody Departamento datos,@PathVariable String id) {
		Departamento departamentoActual = departamentoService.findById(id);
		departamentoActual.setNombre(datos.getNombre());
		departamentoActual.setIdPaisDepFk(datos.getIdPaisDepFk());
		return departamentoService.save(departamentoActual);
	}
}

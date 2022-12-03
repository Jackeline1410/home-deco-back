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

import com.CreativeCode.mitiendag56.models.entity.Materia_prima;
import com.CreativeCode.mitiendag56.models.service.IMateria_primaService;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class Materia_primaController {

	@Autowired
	private IMateria_primaService materia_primaService;
	@GetMapping("/materias_primas")
	public List<Materia_prima> index(){
		return materia_primaService.findAll();
	}
	
	@GetMapping("/materias_primas/{id}")
	public Materia_prima show(@PathVariable String id) {
		return materia_primaService.findById(id);
	}
		
	@PostMapping("/materias_primas")
	@ResponseStatus(HttpStatus.CREATED)
	public Materia_prima create(@RequestBody Materia_prima materia_prima) {
		return materia_primaService.save(materia_prima);
	}
	
	@DeleteMapping("/materias_primas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		materia_primaService.delete(id);
	}
	
	
	@PutMapping("/materias_primas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Materia_prima update(@RequestBody Materia_prima datos,@PathVariable String id) {
		Materia_prima materia_primaActual = materia_primaService.findById(id);
		materia_primaActual.setNombre(datos.getNombre());
		materia_primaActual.setCodigo(datos.getCodigo());
		materia_primaActual.setStockmax(datos.getStockmax());
		materia_primaActual.setStockmin(datos.getStockmin());
		materia_primaActual.setValorunit(datos.getValorunit());
		return materia_primaService.save(materia_primaActual);
	}
}

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


import com.CreativeCode.mitiendag56.models.entity.Empleado;
import com.CreativeCode.mitiendag56.models.service.IEmpleadoService;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class EmpleadoController {

	@Autowired
	private IEmpleadoService empleadoService;
	@GetMapping("/empleados")
	public List<Empleado> index(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado show(@PathVariable String id) {
		return empleadoService.findById(id);
	}
		
	@PostMapping("/empleados")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado create(@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}
	
	@DeleteMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		empleadoService.delete(id);
	}
	
	
	@PutMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado update(@RequestBody Empleado datos,@PathVariable String id) {
		Empleado empleadoActual = empleadoService.findById(id);
		empleadoActual.setNombre(datos.getNombre());
		empleadoActual.setApellido(datos.getApellido());
		empleadoActual.setIdciud(datos.getIdciud());
		empleadoActual.setFechaRegistro(datos.getFechaRegistro());
		return empleadoService.save(empleadoActual);
	}
	
}

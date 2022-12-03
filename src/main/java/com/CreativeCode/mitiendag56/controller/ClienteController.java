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

import com.CreativeCode.mitiendag56.models.entity.Cliente;
import com.CreativeCode.mitiendag56.models.service.IClienteService;


@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/v1")

public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable String id) {
		return clienteService.findById(id);
	}
		
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		clienteService.delete(id);
	}
	
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente datos,@PathVariable String id) {
		Cliente clienteActual = clienteService.findById(id);
		clienteActual.setNombre(datos.getNombre());
		clienteActual.setApellido(datos.getApellido());
		clienteActual.setIdciud(datos.getIdciud());
		clienteActual.setFechaRegistro(datos.getFechaRegistro());
		return clienteService.save(clienteActual);
	}

}

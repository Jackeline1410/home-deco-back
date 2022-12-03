package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.entity.Cliente;

@Service
public interface IClienteService {

	public List<Cliente> findAll(); //SELECT * FROM CLIENTE
	public Cliente findById(String id); //SELECT * FROM CLIENTE WHERE ID=?
	public Cliente save(Cliente cliente);//INSERT INTO cliente()
	public void delete(String id);//DELETE FROM CLIENTE WHERE ID=?
	
}

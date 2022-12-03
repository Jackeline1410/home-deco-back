package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.entity.Proveedor;

@Service
public interface IProveedorService {

	public List<Proveedor> findAll(); //SELECT * FROM PROVEEDOR
	public Proveedor findById(String id); //SELECT * FROM PROVEEDOR WHERE ID=?
	public Proveedor save(Proveedor proveedor);//INSERT INTO proveedor()
	public void delete(String id);//DELETE FROM PROVEEDOR WHERE ID=?
	
}

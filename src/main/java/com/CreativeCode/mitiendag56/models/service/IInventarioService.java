package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Inventario;


public interface IInventarioService {

	public List<Inventario> findAll(); //SELECT * FROM INVENTARIO
	public Inventario findById(String id); //SELECT * FROM INVENTARIO WHERE ID=?
	public Inventario save(Inventario inventario);//INSERT INTO inventario()
	public void delete(String id);//DELETE FROM INVENTARIO WHERE ID=?
	
}

package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Producto;


public interface IProductoService {

	public List<Producto> findAll(); //SELECT * FROM PRODUCTO
	public Producto findById(String id); //SELECT * FROM PRODUCTO WHERE ID=?
	public Producto save(Producto producto);//INSERT INTO producto()
	public void delete(String id);//DELETE FROM PRODUCTO WHERE ID=?
}

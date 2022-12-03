package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Orden_produccion;


public interface IOrden_produccionService {

	public List<Orden_produccion> findAll(); //SELECT * FROM ORDEN_PRODUCCION
	public Orden_produccion findById(String id); //SELECT * FROM ORDEN_PRODUCCION WHERE ID=?
	public Orden_produccion save(Orden_produccion orden_produccion);//INSERT INTO orden_produccion()
	public void delete(String id);//DELETE FROM CLIENTE WHERE ID=?
	
}

package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import com.CreativeCode.mitiendag56.models.entity.Ubicacion;


public interface IUbicacionService {
	
	public List<Ubicacion> findAll(); //SELECT * FROM UBICACION
	public Ubicacion findById(String id); //SELECT * FROM UBICACION WHERE ID=?
	public Ubicacion save(Ubicacion ubicacion);//INSERT INTO ubicacion()
	public void delete(String id);//DELETE FROM UBICACION WHERE ID=?

}

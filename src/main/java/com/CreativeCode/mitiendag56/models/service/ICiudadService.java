package com.CreativeCode.mitiendag56.models.service;


import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Ciudad;


public interface ICiudadService {

	public List<Ciudad> findAll(); //SELECT * FROM CIUDAD
	public Ciudad findById(String id); //SELECT * FROM CIUDAD WHERE ID=?
	public Ciudad save(Ciudad ciudad);//INSERT INTO ciudad()
	public void delete(String id);//DELETE FROM CIUDAD WHERE ID=?

	
}

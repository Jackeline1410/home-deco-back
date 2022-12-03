package com.CreativeCode.mitiendag56.models.service;

import com.CreativeCode.mitiendag56.models.entity.Pais;

import java.util.List;

public interface IPaisService {
	
	public List<Pais> findAll(); //SELECT * FROM PAIS
	public Pais findById(String id); //SELECT * FROM PAIS WHERE ID=?
	public Pais save(Pais pais);//INSERT INTO pais()
	public void delete(String id);//DELETE FROM PAIS WHERE ID=?
	

}

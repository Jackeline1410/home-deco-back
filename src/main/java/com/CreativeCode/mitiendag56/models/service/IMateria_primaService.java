package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Materia_prima;


public interface IMateria_primaService {

	public List<Materia_prima> findAll(); //SELECT * FROM MATERIA_PRIMA
	public Materia_prima findById(String id); //SELECT * FROM MATERIA_PRIMA WHERE ID=?
	public Materia_prima save(Materia_prima materia_prima);//INSERT INTO materia_prima()
	public void delete(String id);//DELETE FROM MATERIA_PRIMA WHERE ID=?
	
}

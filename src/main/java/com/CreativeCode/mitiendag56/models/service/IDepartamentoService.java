package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Departamento;

public interface IDepartamentoService {

	public List<Departamento> findAll(); //SELECT * FROM DEPARTAMENTO
	public Departamento findById(String id); //SELECT * FROM DEPARTAMENTO WHERE ID=?
	public Departamento save(Departamento departamento);//INSERT INTO departamento()
	public void delete(String id);//DELETE FROM DEPARTAMENTO WHERE ID=?
	
	public List<Departamento> findByidPaisDepFk(String idpaisdep);
}

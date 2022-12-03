package com.CreativeCode.mitiendag56.models.dao;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CreativeCode.mitiendag56.models.entity.Departamento;

@Repository
public interface IDepartamentoDao extends CrudRepository<Departamento,String>{
	List<Departamento> findByidPaisDepFk(String idpaisdep);
}

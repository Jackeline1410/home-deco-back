package com.CreativeCode.mitiendag56.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CreativeCode.mitiendag56.models.entity.Materia_prima;


@Repository
public interface IMateria_primaDao extends CrudRepository<Materia_prima,String> {

	
}

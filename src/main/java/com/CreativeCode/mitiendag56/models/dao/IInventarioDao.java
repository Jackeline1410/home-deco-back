package com.CreativeCode.mitiendag56.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CreativeCode.mitiendag56.models.entity.Inventario;


@Repository
public interface IInventarioDao extends CrudRepository<Inventario,String>{

}

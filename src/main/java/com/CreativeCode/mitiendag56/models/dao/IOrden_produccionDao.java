package com.CreativeCode.mitiendag56.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CreativeCode.mitiendag56.models.entity.Orden_produccion;


@Repository
public interface IOrden_produccionDao extends CrudRepository<Orden_produccion,String> {

}

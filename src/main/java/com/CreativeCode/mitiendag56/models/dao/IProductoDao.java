package com.CreativeCode.mitiendag56.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CreativeCode.mitiendag56.models.entity.Producto;

@Repository
public interface IProductoDao extends CrudRepository<Producto,String> {

}

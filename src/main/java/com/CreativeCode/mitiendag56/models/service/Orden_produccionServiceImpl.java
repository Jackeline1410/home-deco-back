package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IOrden_produccionDao;
import com.CreativeCode.mitiendag56.models.entity.Orden_produccion;

@Service
public class Orden_produccionServiceImpl implements IOrden_produccionService {

	@Autowired
	private IOrden_produccionDao orden_produccionDao;
	@Override
	public List<Orden_produccion> findAll() {
		// TODO Auto-generated method stub
		return (List<Orden_produccion>) orden_produccionDao.findAll();
	}

	@Override
	public Orden_produccion findById(String id) {
		// TODO Auto-generated method stub
		return orden_produccionDao.findById(id).orElse(null);
	}

	@Override
	public Orden_produccion save(Orden_produccion orden_produccion) {
		// TODO Auto-generated method stub
		return orden_produccionDao.save(orden_produccion);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		orden_produccionDao.deleteById(id);
	}

}

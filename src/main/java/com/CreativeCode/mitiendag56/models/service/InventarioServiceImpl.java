package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IInventarioDao;
import com.CreativeCode.mitiendag56.models.entity.Inventario;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioDao inventarioDao;
	@Override
	public List<Inventario> findAll() {
		// TODO Auto-generated method stub
		return (List<Inventario>) inventarioDao.findAll();
	}

	@Override
	public Inventario findById(String id) {
		// TODO Auto-generated method stub
		return inventarioDao.findById(id).orElse(null);
	}

	@Override
	public Inventario save(Inventario inventario) {
		// TODO Auto-generated method stub
		return inventarioDao.save(inventario);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		inventarioDao.deleteById(id);
	}

}

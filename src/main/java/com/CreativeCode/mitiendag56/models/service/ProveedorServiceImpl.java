package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IProveedorDao;
import com.CreativeCode.mitiendag56.models.entity.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	private IProveedorDao proveedorDao;
	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedor>) proveedorDao.findAll();
	}

	@Override
	public Proveedor findById(String id) {
		// TODO Auto-generated method stub
		return proveedorDao.findById(id).orElse(null);
	}

	@Override
	public Proveedor save(Proveedor proveedor) {
		// TODO Auto-generated method stub
		return proveedorDao.save(proveedor);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		proveedorDao.deleteById(id);
	}

}

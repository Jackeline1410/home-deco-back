package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.ICiudadDao;
import com.CreativeCode.mitiendag56.models.entity.Ciudad;

@Service
public class CiudadServiceImpl implements ICiudadService {

	@Autowired
	private ICiudadDao ciudadDao;
	@Override
	public List<Ciudad> findAll() {
		// TODO Auto-generated method stub
		return (List<Ciudad>) ciudadDao.findAll();
	}

	@Override
	public Ciudad findById(String id) {
		// TODO Auto-generated method stub
		return ciudadDao.findById(id).orElse(null);
	}

	@Override
	public Ciudad save(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return ciudadDao.save(ciudad);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		ciudadDao.deleteById(id);
	}

}

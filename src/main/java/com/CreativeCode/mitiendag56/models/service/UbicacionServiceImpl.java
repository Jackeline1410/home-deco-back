package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IUbicacionDao;
import com.CreativeCode.mitiendag56.models.entity.Ubicacion;

@Service
public class UbicacionServiceImpl implements IUbicacionService {

	@Autowired
	private IUbicacionDao ubicacionDao;
	@Override
	public List<Ubicacion> findAll() {
		// TODO Auto-generated method stub
		return (List<Ubicacion>) ubicacionDao.findAll();
	}

	@Override
	public Ubicacion findById(String id) {
		// TODO Auto-generated method stub
		return ubicacionDao.findById(id).orElse(null);
	}

	@Override
	public Ubicacion save(Ubicacion ubicacion) {
		// TODO Auto-generated method stub
		return ubicacionDao.save(ubicacion);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		ubicacionDao.deleteById(id);
	}

}

package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IDepartamentoDao;
import com.CreativeCode.mitiendag56.models.entity.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService {

	@Autowired
	private IDepartamentoDao departamentoDao;
	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamento>) departamentoDao.findAll() ;
	}

	@Override
	public Departamento findById(String id) {
		// TODO Auto-generated method stub
		return departamentoDao.findById(id).orElse(null);
	}

	@Override
	public Departamento save(Departamento departamento) {
		// TODO Auto-generated method stub
		return departamentoDao.save(departamento);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		departamentoDao.deleteById(id);
	}

	@Override
	public List<Departamento> findByidPaisDepFk(String idpaisdep) {
		// TODO Auto-generated method stub
		return departamentoDao.findByidPaisDepFk(idpaisdep);
	}

}

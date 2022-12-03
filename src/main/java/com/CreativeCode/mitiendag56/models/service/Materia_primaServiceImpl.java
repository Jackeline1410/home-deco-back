package com.CreativeCode.mitiendag56.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IMateria_primaDao;
import com.CreativeCode.mitiendag56.models.entity.Materia_prima;

@Service
public class Materia_primaServiceImpl implements IMateria_primaService {

	@Autowired
	private IMateria_primaDao materia_primaDao;
	@Override
	public List<Materia_prima> findAll() {
		// TODO Auto-generated method stub
		return (List<Materia_prima>) materia_primaDao.findAll();
	}

	@Override
	public Materia_prima findById(String id) {
		// TODO Auto-generated method stub
		return materia_primaDao.findById(id).orElse(null);
	}

	@Override
	public Materia_prima save(Materia_prima materia_prima) {
		// TODO Auto-generated method stub
		return materia_primaDao.save(materia_prima);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		materia_primaDao.deleteById(id);
	}

}

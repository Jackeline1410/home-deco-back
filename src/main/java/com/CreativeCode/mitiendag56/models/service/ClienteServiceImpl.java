package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.mitiendag56.models.dao.IClienteDao;
import com.CreativeCode.mitiendag56.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente findById(String id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}

}

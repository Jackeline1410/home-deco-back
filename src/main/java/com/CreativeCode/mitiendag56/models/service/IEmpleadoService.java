package com.CreativeCode.mitiendag56.models.service;

import java.util.List;


import com.CreativeCode.mitiendag56.models.entity.Empleado;



public interface IEmpleadoService {

	public List<Empleado> findAll(); //SELECT * FROM EMPLEADO
	public Empleado findById(String id); //SELECT * FROM EMPLEADO WHERE ID=?
	public Empleado save(Empleado empleado);//INSERT INTO empleado()
	public void delete(String id);//DELETE FROM EMPLEADO WHERE ID=?
	
}

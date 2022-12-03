package com.CreativeCode.mitiendag56.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ubicaciones")
public class Ubicacion {
	
	@Id
	@Column(length=10, nullable=false)
	private String id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}

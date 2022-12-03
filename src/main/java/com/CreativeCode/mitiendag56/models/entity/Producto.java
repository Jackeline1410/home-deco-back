package com.CreativeCode.mitiendag56.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

	@Id
	@Column(length=10, nullable=false)
	private String id;
	
	@Column(length=80, nullable=false)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "idProductoFK", insertable=false, updatable=false)
    private Inventario inventario;
	
		
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

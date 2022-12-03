package com.CreativeCode.mitiendag56.models.entity;

import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paises")
public class Pais {
	@Id
	@Column(length=5, nullable=false)
	private String id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="pais")
	private List<Departamento> departamentos;
	
	
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

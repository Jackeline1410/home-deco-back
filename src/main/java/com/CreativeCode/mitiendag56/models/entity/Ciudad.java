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
@Table(name="ciudades")
public class Ciudad {

	@Id
	@Column(length=5, nullable=false)
	private String id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	@Column(length=5, nullable=false)
	private String idDepFk;
	
	@ManyToOne
	@JoinColumn(name = "idDepFk", insertable=false, updatable=false)
    private Departamento departamento;
	
	@OneToMany(mappedBy="ciudad")
	private List<Cliente> clientes;
	
	@OneToMany(mappedBy="ciudad")
	private List<Proveedor> proveedores;
	
	@OneToMany(mappedBy="ciudad")
	private List<Empleado> empleados;
	
	
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
	public String getIdDepFk() {
		return idDepFk;
	}
	public void setIdDepFk(String idDepFk) {
		this.idDepFk = idDepFk;
	}
}

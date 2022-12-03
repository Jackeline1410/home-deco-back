package com.CreativeCode.mitiendag56.models.entity;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor {
	
	@Id
	@Column(length=20, nullable=false)
	private String id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	@Column(length=50, nullable=false)
	private String apellido;
	
	@Column(name="idCiud",length=5, nullable=false)
	private String idCiud;
	
	@Column(name="fecha_registro", nullable=false)
	private LocalDateTime fechaRegistro;
	
	
	@ManyToOne
	@JoinColumn(name = "idCiud", insertable=false, updatable=false)
    private Ciudad ciudad;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdCiud() {
		return idCiud;
	}

	public void setIdCiud(String idCiud) {
		this.idCiud = idCiud;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	
	
	
}

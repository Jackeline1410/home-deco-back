package com.CreativeCode.mitiendag56.models.entity;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@Column(length=5, nullable=false)
	private String id;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	@Column(length=50, nullable=false)
	private String apellido;
	
	@Column(length=5, nullable=false)
	private String idciud;
	
	@Column(name="fecha_registro", nullable=false)
	private LocalDateTime fechaRegistro;
	
	
	@ManyToOne
	@JoinColumn(name = "idciud", insertable=false, updatable=false)
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
	public String getIdciud() {
		return idciud;
	}
	public void setIdciud(String idciud) {
		this.idciud = idciud;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
}

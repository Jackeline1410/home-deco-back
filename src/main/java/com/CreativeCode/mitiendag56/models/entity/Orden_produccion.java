package com.CreativeCode.mitiendag56.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordenes_produccion")
public class Orden_produccion {

	@Id
	@Column(length=20, nullable=false)
	private String id_orden;
	
	@Column(nullable=false)
	private Date fecha_registro;
	
	@Column(length=20, nullable=false)
	private String id_empleado;
	
	@Column(length=20, nullable=false)
	private String id_cliente;
	
	
	public String getId_orden() {
		return id_orden;
	}
	public void setId_orden(String id_orden) {
		this.id_orden = id_orden;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public String getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
}

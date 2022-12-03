package com.CreativeCode.mitiendag56.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materias_primas")
public class Materia_prima {

	@Id
	@Column(length=5, nullable=false)
	private String codigo;
	
	@Column(length=50, nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private Double stockmin;
	
	@Column(nullable=false)
	private Double stockmax;
	
	@Column(nullable=false)
	private Double valorunit;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getStockmin() {
		return stockmin;
	}
	public void setStockmin(Double stockmin) {
		this.stockmin = stockmin;
	}
	public Double getStockmax() {
		return stockmax;
	}
	public void setStockmax(Double stockmax) {
		this.stockmax = stockmax;
	}
	public Double getValorunit() {
		return valorunit;
	}
	public void setValorunit(Double valorunit) {
		this.valorunit = valorunit;
	}
	
	
	
}

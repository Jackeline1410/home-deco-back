package com.CreativeCode.mitiendag56.models.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="inventarios")
public class Inventario {

	@Id
	@Column(length=20, nullable=false)
	private String codinv;
	
	@Column(length=10, nullable=false)
	private String idProductoFk;
	
	@Column(nullable=false)
	private Double stockmin;
	
	@Column(nullable=false)
	private Double stockmax;
	
	@Column(nullable=false)
	private Double cantidad;
	
	
	@OneToMany(mappedBy="inventario")
	private List<Producto> inventarios;
	
	
	public String getCodinv() {
		return codinv;
	}
	public void setCodinv(String codinv) {
		this.codinv = codinv;
	}
	public String getIdProductoFk() {
		return idProductoFk;
	}
	public void setIdProductoFk(String idProductoFk) {
		this.idProductoFk = idProductoFk;
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
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}

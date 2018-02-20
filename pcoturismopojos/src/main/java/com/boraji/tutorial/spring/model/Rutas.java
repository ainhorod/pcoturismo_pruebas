package com.boraji.tutorial.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rutas")
public class Rutas {
	@Id
	@Column(name = "IDRUTA")
	private int idruta;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	public int getIdruta() {
		return idruta;
	}

	public void setIdruta(int idruta) {
		this.idruta = idruta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
	
	
	
	
	
}

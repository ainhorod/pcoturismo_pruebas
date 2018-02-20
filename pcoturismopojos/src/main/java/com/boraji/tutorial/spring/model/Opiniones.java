package com.boraji.tutorial.spring.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "opiniones")
public class Opiniones {  
	
	@Id
	@Column(name = "IDOPINION")
	private int idopinion;
	
	@Column(name = "IDUSUARIO", nullable = false)
	private int idusuario;
	
	@Column(name = "IDRUTA", nullable = false)
	private int idruta;

	@Column(name = "TITULO", nullable = false)
	private String titulo;
	
	@Column(name = "FECPUBLI", nullable = false)
	private Timestamp fecpubli;
	
	@Column(name = "FECRUTA", nullable = false)
	private Date fecruta;

	public int getIdopinion() {
		return idopinion;
	}

	public void setIdopinion(int idopinion) {
		this.idopinion = idopinion;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdruta() {
		return idruta;
	}

	public void setIdruta(int idruta) {
		this.idruta = idruta;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Timestamp getFecpubli() {
		return fecpubli;
	}

	public void setFecpubli(Timestamp fecpubli) {
		this.fecpubli = fecpubli;
	}

	public Date getFecruta() {
		return fecruta;
	}

	public void setFecruta(Date fecruta) {
		this.fecruta = fecruta;
	}
	
}

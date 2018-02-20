package com.boraji.tutorial.spring.model;

import java.sql.Time;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reservas {   
	
	@Id
	@Column(name = "IDRESERVA")
	private int idreserva;
	
	@Column(name = "IDUSUARIO", nullable = false)
	private int usuario;
	
	@Column(name = "IDRUTA", nullable = false)
	private int idruta;

	@Column(name = "FECHA", nullable = false)
	private Date fecha;
	
	@Column(name = "HORA", nullable = false)
	private Time hora;

	public int getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getIdruta() {
		return idruta;
	}

	public void setIdruta(int idruta) {
		this.idruta = idruta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}
		
	
}

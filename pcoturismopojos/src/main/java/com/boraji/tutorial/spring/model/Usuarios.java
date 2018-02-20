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
@Table(name = "usuarios")

public class Usuarios {
	@Id
	@Column(name = "IDUSUARIO")
	private int idusuario;

	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	@Column(name = "APELLIDOS", nullable = false)
	private String apellidos;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "ENABLED", nullable = false)
	private boolean enabled;
	//
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	// private Set<Authorities> authorities = new HashSet<>();

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	// public Set<Authorities> getAuthorities() {
	// return authorities;
	// }
	//
	// public void setAuthorities(Set<Authorities> authorities) {
	// this.authorities = authorities;
	// }
}
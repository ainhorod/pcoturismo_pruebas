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
	@Table(name = "wishlist")
	public class Wishlist {

		@Id
		@Column(name = "IDWISH")
		private int idwish;

		@Column(name = "IDUSUARIO", nullable = false)
		private int idusuario;

		@Column(name = "IDRUTA", nullable = false)
		private int idruta;

		@Column(name = "NOMBRE", nullable = false)
		private String nombre;

		public int getIdwish() {
			return idwish;
		}

		public void setIdwish(int idwish) {
			this.idwish = idwish;
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

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

//		@Column(name = "ENABLED", nullable = false)
//		private boolean enabled;
}

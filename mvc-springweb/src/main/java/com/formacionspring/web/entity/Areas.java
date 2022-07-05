package com.formacionspring.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="areas")
public class Areas implements Serializable {
	
	 
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
	  @Column(nullable = false, length = 50)
      private String nombre;
	  @Column(nullable = false,length = 50, unique = true)
      private long codigo;
      
      
      
      
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
      
      
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

}

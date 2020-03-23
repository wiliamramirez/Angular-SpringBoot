package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@NotEmpty
	@Size(min = 4, max = 30)
	private String nombre;

	@NotEmpty
	private String apellido;

	@NotEmpty
	@Email
	@Column(nullable = false, unique = false)
	private String email;

	@Column(name = "crear_en")
	@Temporal(TemporalType.DATE)
	private Date crearEn;

	@PrePersist
	public void prePersist() {
		this.crearEn = new Date();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCrearEn() {
		return crearEn;
	}

	public void setCrearEn(Date crearEn) {
		this.crearEn = crearEn;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

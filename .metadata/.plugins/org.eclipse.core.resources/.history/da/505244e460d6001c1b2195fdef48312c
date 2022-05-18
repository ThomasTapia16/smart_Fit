package com.example.demo.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_admin")
public abstract class DTI{

	@Id
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String pwd;
	public DTI(String rut, String nombre, String apellido, String correo, String pwd) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.pwd = pwd;
	}
	
}

package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;



@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {
	
	@Id
	private String rut;
	private String nombre;
	private String apellido;
	private String correo;
	private String pwd;
	
	public Persona(String rut, String nombre, String apellido, String correo, String pwd) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.pwd = pwd;
	}
	
	
}

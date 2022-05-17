package com.example.demo.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name=" Colaboradores")
public class Colaborador extends Persona{
	

	@ManyToOne
	private Sede sede;
	private Boolean es_ecargado;//agregar a constructors
	public Colaborador(String rut, String nombre, String apellido, String correo, String pwd) {
		super(rut, nombre, apellido, correo, pwd);
		
	}
	
	
	
}

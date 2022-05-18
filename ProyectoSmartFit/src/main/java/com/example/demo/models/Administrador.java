package com.example.demo.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("0")
public class Administrador extends DTI{

	public Administrador(String rut, String nombre, String apellido, String correo, String pwd) {
		super(rut, nombre, apellido, correo, pwd);
		// TODO Auto-generated constructor stub
	}

	

}

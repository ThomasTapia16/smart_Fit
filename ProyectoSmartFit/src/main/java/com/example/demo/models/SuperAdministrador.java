package com.example.demo.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class SuperAdministrador extends DTI{

	public SuperAdministrador(String rut, String nombre, String apellido, String correo, String pwd) {
		super(rut, nombre, apellido, correo, pwd);
		// TODO Auto-generated constructor stub
	}

	

}

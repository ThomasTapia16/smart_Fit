package com.example.demo.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SM")
public class SalaMusculacion extends Sala{

	public SalaMusculacion(Long id, int numero_sala, Sede sede, Piso piso) {
		super(id, numero_sala, sede, piso);
		// TODO Auto-generated constructor stub
	}
	
}

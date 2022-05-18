package com.example.demo.models;

import java.util.LinkedList;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class SalaRecepcion extends Sala{
	private LinkedList<Colaborador> encargadosRecepcion = new LinkedList<>();
	public SalaRecepcion(Long id, int numero_sala, Sede sede, Piso piso) {
		super(id, numero_sala, sede, piso);
		// TODO Auto-generated constructor stub
	}

	
}
 
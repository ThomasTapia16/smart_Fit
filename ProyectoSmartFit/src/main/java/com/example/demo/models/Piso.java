package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pisos")
public class Piso {
	@Id
	private float id;
	@ManyToOne
	private Sede sede;
	@OneToMany(targetEntity=Colaborador.class)
	private List<Colaborador> encargado;
	@OneToMany(targetEntity=Sala.class)
	private List<Sala> salas;
	
	
	public Piso() {
		super();
	}
	
	
}

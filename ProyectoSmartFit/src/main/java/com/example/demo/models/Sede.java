package com.example.demo.models;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sede {
	
	@Id
	private long id;
	private String nombre;
	private String region;
	private String ciudad;
	@OneToMany(targetEntity=Sala.class)
	private List<Sala> salas;
	@OneToMany(targetEntity=Piso.class)
	private List<Piso> pisos;
	@OneToOne
	private Colaborador encargado;
	@OneToMany(targetEntity=Colaborador.class)
	private List<Colaborador> colaboradores;
}

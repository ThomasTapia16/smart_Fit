package com.example.demo.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

@DiscriminatorColumn(name="tipo")
@Table(name="Salas")
public abstract class Sala {
	
	@Id
	private Long id;
	private int numero_sala;
	@ManyToOne
	private Sede sede;
	@ManyToOne
	private Piso piso;
	public Sala(Long id, int numero_sala, Sede sede, Piso piso) {
		super();
		this.id = id;
		this.numero_sala = numero_sala;
		this.sede = sede;
		this.piso = piso;
	}
	
	
}

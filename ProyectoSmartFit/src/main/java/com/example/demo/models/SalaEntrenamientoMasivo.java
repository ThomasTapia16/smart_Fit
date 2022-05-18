package com.example.demo.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("EM")
public class SalaEntrenamientoMasivo extends Sala{
	
	@ManyToOne
	private Clase clase;
	public SalaEntrenamientoMasivo(Long id, int numero_sala, Sede sede, Piso piso) {
		super(id, numero_sala, sede, piso);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}

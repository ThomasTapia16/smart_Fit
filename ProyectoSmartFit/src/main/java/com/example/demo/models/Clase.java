package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name="Clases")
public class Clase {
	@Id
	private long id;
	@ManyToOne
	private SalaEntrenamientoMasivo sala;
}

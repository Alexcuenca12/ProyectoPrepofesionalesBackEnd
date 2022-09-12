package com.ista.tecazuay.proyecto.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coordinador")
public class Coordinador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_coordinador;
	private String horario;

	public Long getId_coordinador() {
		return id_coordinador;
	}

	public void setId_coordinador(Long id_coordinador) {
		this.id_coordinador = id_coordinador;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}

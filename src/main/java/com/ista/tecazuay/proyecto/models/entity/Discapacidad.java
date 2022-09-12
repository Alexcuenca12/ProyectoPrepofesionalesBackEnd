package com.ista.tecazuay.proyecto.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "discapacidades")
public class Discapacidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_carnet;
	private String carnet_conadis;
	private String tipo_discapacidad;
	private String porcentaje_discapacidad;
	private Long id_persona;

	public Long getId_carnet() {
		return id_carnet;
	}

	public void setId_carnet(Long id_carnet) {
		this.id_carnet = id_carnet;
	}

	public String getCarnet_conadis() {
		return carnet_conadis;
	}

	public void setCarnet_conadis(String carnet_conadis) {
		this.carnet_conadis = carnet_conadis;
	}

	public String getTipo_discapacidad() {
		return tipo_discapacidad;
	}

	public void setTipo_discapacidad(String tipo_discapacidad) {
		this.tipo_discapacidad = tipo_discapacidad;
	}

	public String getPorcentaje_discapacidad() {
		return porcentaje_discapacidad;
	}

	public void setPorcentaje_discapacidad(String porcentaje_discapacidad) {
		this.porcentaje_discapacidad = porcentaje_discapacidad;
	}

	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}
}

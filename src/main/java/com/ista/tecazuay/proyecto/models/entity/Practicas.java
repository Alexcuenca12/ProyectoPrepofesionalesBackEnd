package com.ista.tecazuay.proyecto.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "practicas")
public class Practicas implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_practica;
	private String lugar;
	private Double calificacion;
	@Column(name = "hora_ingreso")
	@Temporal(TemporalType.TIME)
	private Date hora_ingreso;
	@Column(name = "hora_salida")
	@Temporal(TemporalType.TIME)
	private Date hora_salida;
	@Column(name = "horas_totales")
	@Temporal(TemporalType.TIME)
	private Date horas_totales;
	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Date fecha_inicio;
	@Column(name = "fecha_fin")
	@Temporal(TemporalType.DATE)
	private Date fecha_fin;

	public Long getId_practica() {
		return id_practica;
	}

	public void setId_practica(Long id_practica) {
		this.id_practica = id_practica;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public Date getHora_ingreso() {
		return hora_ingreso;
	}

	public void setHora_ingreso(Date hora_ingreso) {
		this.hora_ingreso = hora_ingreso;
	}

	public Date getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(Date hora_salida) {
		this.hora_salida = hora_salida;
	}

	public Date getHoras_totales() {
		return horas_totales;
	}

	public void setHoras_totales(Date horas_totales) {
		this.horas_totales = horas_totales;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
}

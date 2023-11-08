package com.componentes.ulatina.modelo;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "comp_detalle")
public class Detalle implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "codigoGeneral ", nullable = false, unique = true)
	String codigoGeneral;
	@Column(name = "descripcion ", nullable = false, unique = true)
	String descripcion;
	@ManyToOne
	@JoinColumn(name = "maestro", nullable = false)
	Maestro maestro;	
	
	public Detalle() {

	}

	public Detalle(int id, String codigoGeneral, String descripcion, Maestro maestro) {
		this.id = id;
		this.codigoGeneral = codigoGeneral;
		this.descripcion = descripcion;
		this.maestro = maestro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoGeneral() {
		return codigoGeneral;
	}

	public void setCodigoGeneral(String codigoGeneral) {
		this.codigoGeneral = codigoGeneral;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Maestro getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}
}

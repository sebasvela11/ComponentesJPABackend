package com.componentes.ulatina.modelo;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@NamedQueries(value = {
		@NamedQuery(name = "Maestro.maestroPorId", query = "SELECT m FROM Maestro m WHERE m.id = :idParam"),
		@NamedQuery(name = "Maestro.maestroPorCodigoGeneral", query = "SELECT m FROM Maestro m WHERE m.codigoGeneral = :codigoGeneralParam") })
@Table(name = "comp_maestro")
public class Maestro implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "codigoGeneral ", nullable = false, unique = true)
	private String codigoGeneral;
	@Column(name = "descripcion ", nullable = false, unique = true)
	private String descripcion;
	
	public Maestro() {
		
	}
	
	public Maestro(int id, String codigoGeneral, String descripcion) {
		this.id = id;
		this.codigoGeneral = codigoGeneral;
		this.descripcion = descripcion;
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
}

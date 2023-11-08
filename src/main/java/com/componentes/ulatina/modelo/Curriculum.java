package com.componentes.ulatina.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "comp_curriculum")
public class Curriculum implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@ManyToOne
	@JoinColumn(name = "empleado", nullable = false)
	Empleado empleado;
	@Transient
	List<DetalleCurriculum> listaDetalleCurriculum;
	public Curriculum() {

	}
	
	public Curriculum(int id, Empleado empleado) {
		this.id = id;
		this.empleado = empleado;
	}

	public Curriculum(int id, Empleado empleado, List<DetalleCurriculum> listaDetalleCurriculum) {
		this.id = id;
		this.empleado = empleado;
		this.listaDetalleCurriculum = listaDetalleCurriculum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<DetalleCurriculum> getListaDetalleCurriculum() {
		return listaDetalleCurriculum;
	}

	public void setListaDetalleCurriculum(List<DetalleCurriculum> listaDetalleCurriculum) {
		this.listaDetalleCurriculum = listaDetalleCurriculum;
	}
}

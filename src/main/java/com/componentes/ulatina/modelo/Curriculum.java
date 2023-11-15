package com.componentes.ulatina.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


public class Curriculum implements Serializable{
	
	Empleado empleado;
	List<DetalleCurriculum> listaDetalleCurriculum;
	
	public Curriculum() {

	}

	public Curriculum(Empleado empleado, List<DetalleCurriculum> listaDetalleCurriculum) {
		this.empleado = empleado;
		this.listaDetalleCurriculum = listaDetalleCurriculum;
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

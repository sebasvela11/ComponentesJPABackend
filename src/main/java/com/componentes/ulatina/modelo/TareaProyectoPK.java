package com.componentes.ulatina.modelo;

import java.io.Serializable;
import java.util.Objects;


public class TareaProyectoPK implements Serializable {
	private int id;
	private Proyecto proyecto;
	private Empleado empleado;

	public TareaProyectoPK() {

	}

	public TareaProyectoPK(int id, Proyecto proyecto, Empleado empleado) {
		this.id = id;
		this.proyecto = proyecto;
		this.empleado = empleado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    TareaProyectoPK other = (TareaProyectoPK) obj;
	    return id == other.id && proyecto.equals(other.proyecto) && empleado.equals(other.empleado);
	}

	@Override
	public int hashCode() {
	    return Objects.hash(id, proyecto, empleado);
	}

}

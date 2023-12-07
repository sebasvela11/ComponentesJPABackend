package com.componentes.ulatina.modelo;

import java.io.Serializable;
import java.util.Objects;

public class HorarioPK implements Serializable{
	
	private Integer id;
	private Integer empleado;
	
	public HorarioPK() {
		
	}

	public HorarioPK(Integer id, Integer empleado) {
		super();
		this.id = id;
		this.empleado = empleado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Integer empleado) {
		this.empleado = empleado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empleado, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HorarioPK other = (HorarioPK) obj;
		return Objects.equals(empleado, other.empleado) && Objects.equals(id, other.id);
	}
	
	
}

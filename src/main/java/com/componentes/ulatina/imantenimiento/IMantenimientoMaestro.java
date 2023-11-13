package com.componentes.ulatina.imantenimiento;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Maestro;

public interface IMantenimientoMaestro<E> {
	
	public Maestro maestroPorId(EntityManager em, int id);
	public Maestro maestroPorCodigoGeneral(EntityManager em, String codigoGeneral);
	
}

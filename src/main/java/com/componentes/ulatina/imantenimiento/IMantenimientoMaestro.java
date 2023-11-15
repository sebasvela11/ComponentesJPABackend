package com.componentes.ulatina.imantenimiento;

import javax.persistence.EntityManager;


public interface IMantenimientoMaestro<E> {
	
	public E maestroPorId(EntityManager em, int id);
	public E maestroPorCodigoGeneral(EntityManager em, String codigoGeneral);
	
}

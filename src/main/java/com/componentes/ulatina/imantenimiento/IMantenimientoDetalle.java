package com.componentes.ulatina.imantenimiento;

import javax.persistence.EntityManager;

public interface IMantenimientoDetalle<E> {
	
	public E detallePorId(EntityManager em, int id);
	public E detallePorCodigoGeneral(EntityManager em, String codigoGeneral);
}

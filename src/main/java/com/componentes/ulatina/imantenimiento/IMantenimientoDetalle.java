package com.componentes.ulatina.imantenimiento;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Detalle;

public interface IMantenimientoDetalle<E> {
	
	public Detalle detallePorId(EntityManager em, int id);
	public Detalle detallePorCodigoGeneral(EntityManager em, String codigoGeneral);
}

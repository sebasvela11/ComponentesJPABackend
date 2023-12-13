package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Maestro;

public interface IMantenimientoDetalle<E> {
	
	public E detallePorId(EntityManager em, int id);
	public E detallePorCodigoGeneral(EntityManager em, String codigoGeneral);
	public List<E> detallePorMaestro(EntityManager em, Maestro maestro);
}

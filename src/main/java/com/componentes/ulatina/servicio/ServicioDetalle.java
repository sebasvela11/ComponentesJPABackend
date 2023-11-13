package com.componentes.ulatina.servicio;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoDetalle;
import com.componentes.ulatina.modelo.Detalle;

public class ServicioDetalle implements IMantenimientoDetalle<Detalle>{
	
	@Override
	public Detalle detallePorId(EntityManager em, int id) {
		Detalle detalle = new Detalle();
		return detalle;
	}
	
	@Override
	public Detalle detallePorCodigoGeneral(EntityManager em, String codigoGeneral) {
		Detalle detalle = new Detalle();
		return detalle;
	}
}

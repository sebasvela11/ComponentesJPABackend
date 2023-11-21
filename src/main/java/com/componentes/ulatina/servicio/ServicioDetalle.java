package com.componentes.ulatina.servicio;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoDetalle;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Maestro;

public class ServicioDetalle implements IMantenimientoDetalle<Detalle>{
	
	@Override
	public Detalle detallePorId(EntityManager em, int id) {
		Detalle detalle = new Detalle();
		try {
			detalle = (Detalle) em.createNamedQuery("Detalle.detallePorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();	
		}
		return detalle;
	}
	
	@Override
	public Detalle detallePorCodigoGeneral(EntityManager em, String codigoGeneral) {
		Detalle detalle = new Detalle();
		try {
			detalle = (Detalle) em.createNamedQuery("Detalle.detallePorCodigoGeneral")
					.setParameter("codigoGeneralParam", new String(codigoGeneral)).getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return detalle;
	}
}

package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.componentes.ulatina.imantenimiento.IMantenimientoDetalle;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;
import com.componentes.ulatina.modelo.Maestro;

public class ServicioDetalle implements IMantenimientoDetalle<Detalle>{
	
	@Override
	public Detalle detallePorId(EntityManager em, int id) {
		Detalle detalle = new Detalle();
		try {
			em.getTransaction().begin();
			detalle = (Detalle) em.createNamedQuery("Detalle.detallePorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();	
		}
		return detalle;
	}
	
	@Override
	public Detalle detallePorCodigoGeneral(EntityManager em, String codigoGeneral) {
		Detalle detalle = new Detalle();
		try {
			em.getTransaction().begin();
			detalle = (Detalle) em.createNamedQuery("Detalle.detallePorCodigoGeneral")
					.setParameter("codigoGeneralParam", new String(codigoGeneral)).getSingleResult();
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return detalle;
	}
	
	@Override
	public List<Detalle> detallePorMaestro(EntityManager em, Maestro maestro) {
		TypedQuery<Detalle> detalles = null;
		try {
			em.getTransaction().begin();
			detalles = em.createNamedQuery("Detalle.detallePorMaestro", Detalle.class)
					.setParameter("maestroParam", maestro);
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return detalles.getResultList();
	}
}

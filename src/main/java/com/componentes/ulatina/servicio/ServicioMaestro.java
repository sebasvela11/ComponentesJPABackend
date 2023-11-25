package com.componentes.ulatina.servicio;


import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoMaestro;
import com.componentes.ulatina.modelo.Maestro;

public class ServicioMaestro implements IMantenimientoMaestro<Maestro>{

	@Override
	public Maestro maestroPorId(EntityManager em, int id) {
		Maestro maestro = new Maestro();
		try {
			em.getTransaction().begin();
			maestro = (Maestro) em.createNamedQuery("Maestro.maestroPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return maestro;
	}
	
	@Override
	public Maestro maestroPorCodigoGeneral(EntityManager em, String codigoGeneral) {
		Maestro maestro = new Maestro();
		try {
			em.getTransaction().begin();
			maestro = (Maestro) em.createNamedQuery("Maestro.maestroPorCodigoGeneral")
					.setParameter("codigoGeneralParam", new String(codigoGeneral)).getSingleResult();
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return maestro;
	}

}

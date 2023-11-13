package com.componentes.ulatina.servicio;


import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoMaestro;
import com.componentes.ulatina.modelo.Maestro;

public class ServicioMaestro implements IMantenimientoMaestro<Maestro>{

	@Override
	public Maestro maestroPorId(EntityManager em, int id) {
		Maestro meastro = new Maestro();
		return meastro;
	}
	
	@Override
	public Maestro maestroPorCodigoGeneral(EntityManager em, String codigoGeneral) {
		Maestro meastro = new Maestro();
		return meastro;
	}

}

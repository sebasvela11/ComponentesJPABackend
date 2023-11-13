package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoProyecto;
import com.componentes.ulatina.modelo.Proyecto;

public class ServicioProyecto implements IMantenimientoProyecto<Proyecto>{

	@Override
	public void insertar(EntityManager em, Proyecto obj) {

	}

	@Override
	public Proyecto proyectoPorId(EntityManager em, int id) {
		Proyecto proyecto = new Proyecto ();
		return proyecto;
		
	}

	@Override
	public List<Proyecto> listar(EntityManager em) {
		List<Proyecto> proyectos = new ArrayList<Proyecto>();
		return proyectos;
	
	}



}

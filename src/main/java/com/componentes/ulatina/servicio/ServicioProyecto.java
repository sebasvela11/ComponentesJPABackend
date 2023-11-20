package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.componentes.ulatina.imantenimiento.IMantenimientoProyecto;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;
import com.componentes.ulatina.modelo.Proyecto;
import com.componentes.ulatina.modelo.TareaProyecto;

public class ServicioProyecto implements IMantenimientoProyecto<Proyecto>{

	@Override
	public void insertar(EntityManager em, Proyecto obj) {
		em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
	}

	@Override
	public Proyecto proyectoPorId(EntityManager em, int id) {
		Proyecto proyecto = new Proyecto ();
		return proyecto;
		
	}

	@Override
	public List<Proyecto> listar(EntityManager em) {
		TypedQuery<Proyecto> proyectos = em.createNamedQuery("Proyecto.buscarTodosProyectos", Proyecto.class);
		return proyectos.getResultList();
	}


	@Override
	public List<Proyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		List<Proyecto> proyectos = new ArrayList<Proyecto>();
		return proyectos;
	}

	@Override
	public List<Proyecto> listarPorEstado(EntityManager em, Detalle detalle) {
		List<Proyecto> proyectos = new ArrayList<Proyecto>();
		return proyectos;
	}

	@Override
	public List<Proyecto> listarPorEstadoEmpleado(EntityManager em, Detalle detalle, Empleado empleado) {
		List<Proyecto> proyectos = new ArrayList<Proyecto>();
		return proyectos;
	}



}

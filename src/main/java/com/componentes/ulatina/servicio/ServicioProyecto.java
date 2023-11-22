package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.componentes.ulatina.imantenimiento.IMantenimientoProyecto;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;
import com.componentes.ulatina.modelo.Proyecto;

public class ServicioProyecto implements IMantenimientoProyecto<Proyecto> {

	@Override
	public void insertar(EntityManager em, Proyecto obj) {
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Proyecto proyectoPorId(EntityManager em, int id) {
		Proyecto proyecto = new Proyecto();
		try {
			proyecto = (Proyecto) em.createNamedQuery("Proyecto.buscarPorId").setParameter("idParam", new Integer(id))
					.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return proyecto;

	}

	@Override
	public List<Proyecto> listar(EntityManager em) {
		TypedQuery<Proyecto> proyectos = null;
		try {
			proyectos = em.createNamedQuery("Proyecto.buscarTodosProyectos", Proyecto.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proyectos.getResultList();
	}

	@Override
	public List<Proyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		List<Proyecto> proyectos = new ArrayList<Proyecto>();
		return proyectos;
	}

	@Override
	public List<Proyecto> listarPorEstado(EntityManager em, Detalle detalle) {
		TypedQuery<Proyecto> proyectos = null;
		try {
			proyectos = em.createNamedQuery("Proyecto.buscarPorEstado", Proyecto.class).setParameter("estadoParam", detalle);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return proyectos.getResultList();
	
	}

	@Override
	public List<Proyecto> listarPorEstadoEmpleado(EntityManager em, Detalle detalle, Empleado empleado) {
		List<Proyecto> proyectos = new ArrayList<Proyecto>();
		return proyectos;
	}

}
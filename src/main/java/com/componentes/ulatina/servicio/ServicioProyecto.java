package com.componentes.ulatina.servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.componentes.ulatina.imantenimiento.IMantenimientoProyecto;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.DetalleCurriculum;
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
			em.getTransaction().commit();
			e.printStackTrace();
		}
	}
	
	@Override
	public void modificar(EntityManager em, Proyecto obj) {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
	}

	@Override
	public Proyecto proyectoPorId(EntityManager em, int id) {
		Proyecto proyecto = new Proyecto();
		try {
			em.getTransaction().begin();
			proyecto = (Proyecto) em.createNamedQuery("Proyecto.buscarPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return proyecto;

	}

	@Override
	public List<Proyecto> listar(EntityManager em) {
		TypedQuery<Proyecto> proyectos = null;
		try {
			em.getTransaction().begin();
			proyectos = em.createNamedQuery("Proyecto.buscarTodosProyectos", Proyecto.class);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return proyectos.getResultList();
	}

	@Override
	public List<Proyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		TypedQuery<Proyecto> proyectos = null;
		try {
			em.getTransaction().begin();
			proyectos = em.createNamedQuery("Proyecto.buscarPorEmpleado", Proyecto.class)
					.setParameter("idUsuarioParam", new Integer(empleado.getId()));
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return proyectos.getResultList();
	}

	@Override
	public List<Proyecto> listarPorEstado(EntityManager em, Detalle detalle) {
		TypedQuery<Proyecto> proyectos = null;
		try {
			em.getTransaction().begin();
			proyectos = em.createNamedQuery("Proyecto.buscarPorEstado", Proyecto.class)
					.setParameter("estadoParam", detalle);	
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return proyectos.getResultList();
	
	}

	@Override
	public List<Proyecto> listarPorEstadoEmpleado(EntityManager em, Detalle detalle, Empleado empleado) {
		TypedQuery<Proyecto> proyectos = null;
		try {
			em.getTransaction().begin();
			proyectos = em.createNamedQuery("Proyecto.buscarPorEstadoEmpleado", Proyecto.class)
					.setParameter("idUsuarioParam", new Integer(empleado.getId()))
					.setParameter("idEstadoParam", new Integer(detalle.getId()));
			em.getTransaction().commit();
		}catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return proyectos.getResultList();
	}

}
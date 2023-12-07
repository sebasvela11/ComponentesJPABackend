package com.componentes.ulatina.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.componentes.ulatina.imantenimiento.IMantenimientoTareaProyecto;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;
import com.componentes.ulatina.modelo.Proyecto;
import com.componentes.ulatina.modelo.TareaProyecto;

public class ServicioTareaProyecto implements IMantenimientoTareaProyecto<TareaProyecto> {

	@Override
	public void insertar(EntityManager em, TareaProyecto obj) {
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
	public TareaProyecto tereaProyectoPorId(EntityManager em, int id) {
		TareaProyecto tareaProyecto = null;
		try {
			em.getTransaction().begin();
			tareaProyecto = (TareaProyecto) em.createNamedQuery("TareaProyecto.buscarPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return tareaProyecto;
	}

	@Override
	public List<TareaProyecto> listar(EntityManager em) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			em.getTransaction().begin();
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarTodasTareas", TareaProyecto.class);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorProyecto(EntityManager em, Proyecto proyecto) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			em.getTransaction().begin();
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorProyecto",TareaProyecto.class)
					.setParameter("proyectoParam", proyecto);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			em.getTransaction().begin();
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorEmpleado",TareaProyecto.class)
					.setParameter("empleadoParam", empleado);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorEmpleadoProyecto(EntityManager em, Empleado empleado, Proyecto proyecto) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			em.getTransaction().begin();
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorEmpleadoProyecto",TareaProyecto.class)
					.setParameter("empleadoParam", empleado)
					.setParameter("proyectoParam", proyecto);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorTipo(EntityManager em, Detalle detalle) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			em.getTransaction().begin();
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorTipo",TareaProyecto.class)
					.setParameter("detalleParam", detalle);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

}
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
			e.printStackTrace();
		}
	}

	@Override
	public TareaProyecto tereaProyectoPorId(EntityManager em, int id) {
		TareaProyecto tareaProyecto = null;
		try {
			tareaProyecto = (TareaProyecto) em.createNamedQuery("TareaProyecto.buscarPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareaProyecto;
	}

	@Override
	public List<TareaProyecto> listar(EntityManager em) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarTodasTareas", TareaProyecto.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorProyecto(EntityManager em, Proyecto proyecto) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorProyecto",
					TareaProyecto.class);
			tareasProyecto.setParameter("proyectoParam", proyecto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorEmpleado",
					TareaProyecto.class);
			tareasProyecto.setParameter("empleadoParam", empleado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorEmpleadoProyecto(EntityManager em, Empleado empleado, Proyecto proyecto) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorEmpleadoProyecto",
					TareaProyecto.class);
			tareasProyecto.setParameter("empleadoParam", empleado);
			tareasProyecto.setParameter("proyectoParam", proyecto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorTipo(EntityManager em, Detalle detalle) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarPorTipo",
					TareaProyecto.class);
			tareasProyecto.setParameter("detalleParam", detalle);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

}
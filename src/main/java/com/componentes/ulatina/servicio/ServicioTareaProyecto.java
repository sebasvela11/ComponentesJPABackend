package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.componentes.ulatina.imantenimiento.IMantenimientoTareaProyecto;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.DetalleCurriculum;
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
		TareaProyecto tareaProyecto = new TareaProyecto();
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tareaProyecto;
	}

	@Override
	public List<TareaProyecto> listar(EntityManager em) {
		TypedQuery<TareaProyecto> tareasProyecto = null;
		try {
			tareasProyecto = em.createNamedQuery("TareaProyecto.buscarTodasTareas",TareaProyecto.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tareasProyecto.getResultList();
	}

	@Override
	public List<TareaProyecto> listarPorProyecto(EntityManager em, Proyecto proyecto) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorEmpleadoProyecto(EntityManager em, Empleado empleado, Proyecto proyecto) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorTipo(EntityManager em, Detalle detalle) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

}

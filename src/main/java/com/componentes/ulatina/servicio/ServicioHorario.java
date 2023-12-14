package com.componentes.ulatina.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.componentes.ulatina.imantenimiento.IMantenimientoHorario;
import com.componentes.ulatina.modelo.DetalleCurriculum;
import com.componentes.ulatina.modelo.Horario;

public class ServicioHorario implements IMantenimientoHorario<Horario>{

	@Override
	public void insertar(EntityManager em, Horario horario) {
		try {
			em.getTransaction().begin();
			em.persist(horario);
			em.getTransaction().commit();
		}catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
	        }
			e.printStackTrace();
		}
	}
	
	@Override
	public void modificar(EntityManager em, Horario obj) {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
	        }
			e.printStackTrace();
		}
	}

	@Override
	public List<Horario> listar(EntityManager em) {
		TypedQuery<Horario> empleados = null;
		try {
			em.getTransaction().begin();
			empleados = em.createNamedQuery("Horario.buscarTodosHorarios", Horario.class);
			em.getTransaction().commit();
		}catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
	        }
			e.printStackTrace();
		}
		return empleados.getResultList();
	}

	@Override
	public Horario horarioPorId(EntityManager em, Integer id) {
		Horario horario = new Horario();
		try {
			em.getTransaction().begin();
			horario = (Horario) em.createNamedQuery("Horario.buscarPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		}catch(Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
	        }
			e.printStackTrace();
		}
		return horario;
	}

	@Override
	public Horario horarioPorEmpleado(EntityManager em, Integer empleado) {
		Horario horario = new Horario();
		try {
			em.getTransaction().begin();
			horario = (Horario) em.createNamedQuery("Horario.buscarPorEmpleado")
					.setParameter("empleadoParam", new Integer(empleado)).getSingleResult();
			em.getTransaction().commit();
		}catch(Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
	        }
			e.printStackTrace();
		}
		return horario;
	}

	@Override
	public Horario horarioPorIdEmpleado(EntityManager em, Integer id, Integer empleado) {
		Horario horario = new Horario();
		try {
			em.getTransaction().begin();
			horario = (Horario) em.createNamedQuery("Horario.buscarPorEmpleado")
					.setParameter("empleadoParam", new Integer(id)).setParameter("idParam", new Integer(empleado)).getSingleResult();
			em.getTransaction().commit();
		}catch(Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
	        }
			e.printStackTrace();
		}
		return horario;
	}

}

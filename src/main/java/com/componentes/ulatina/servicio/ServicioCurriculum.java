package com.componentes.ulatina.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.componentes.ulatina.imantenimiento.IMantenimientoCurriculum;
import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Empleado;

public class ServicioCurriculum implements IMantenimientoCurriculum<Curriculum>{
	
	@Override
	public void insertar(EntityManager em, Curriculum obj) {
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void modificar(EntityManager em, Curriculum obj) {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Curriculum curriculumPorId(EntityManager em, int id) {
		Curriculum curriculum = new Curriculum();
		try {
			em.getTransaction().begin();
			curriculum = (Curriculum) em.createNamedQuery("Curriculum.CurriculumPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return curriculum;
	}

	@Override
	public Curriculum curriculumPorEmpleado(EntityManager em, Empleado empleado) {
		Curriculum curriculum = new Curriculum();
		try {
			em.getTransaction().begin();
			curriculum = (Curriculum) em.createNamedQuery("Curriculum.CurriculumPorEmpleado")
					.setParameter("empleadoParam", empleado).getSingleResult();
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return curriculum;
	}

	@Override
	public List<Curriculum> listar(EntityManager em) {
		TypedQuery<Curriculum> curriculum = null;
		try {
			em.getTransaction().begin();
			curriculum = em.createNamedQuery("Curriculum.buscarTodosCurriculums", Curriculum.class);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().commit();
			e.printStackTrace();
		}
		return curriculum.getResultList();
	}

}

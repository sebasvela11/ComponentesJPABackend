package com.componentes.ulatina.servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.componentes.ulatina.imantenimiento.IMantenimientoDetalleCurriculum;
import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.DetalleCurriculum;
import com.componentes.ulatina.modelo.Empleado;

public class ServicioDetalleCurriculum implements IMantenimientoDetalleCurriculum<DetalleCurriculum> {

	@Override
	public void insertar(EntityManager em, DetalleCurriculum obj) {
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public DetalleCurriculum detalleCurriculumPorId(EntityManager em, int id) {
		DetalleCurriculum detalleCurriculum = new DetalleCurriculum();
		try {
			em.getTransaction().begin();
			detalleCurriculum = (DetalleCurriculum) em.createNamedQuery("DetalleCurriculum.buscarPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detalleCurriculum;
	}

	@Override
	public List<DetalleCurriculum> listar(EntityManager em) {
		TypedQuery<DetalleCurriculum> detallesCurriculum = null;
		try {
			em.getTransaction().begin();
			detallesCurriculum = em.createNamedQuery("DetalleCurriculum.buscarTodosDetalles", DetalleCurriculum.class);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detallesCurriculum.getResultList();
	}

	@Override
	public List<DetalleCurriculum> listarPorTipo(EntityManager em, Detalle detalle) {
		TypedQuery<DetalleCurriculum> detalleCurriculum = null;
		try {
			em.getTransaction().begin();
			detalleCurriculum = em.createNamedQuery("DetalleCurriculum.buscarPorTipo", DetalleCurriculum.class)
					.setParameter("detalleParam", detalle);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return detalleCurriculum.getResultList();
	}

	@Override
	public List<DetalleCurriculum> listarPorCurriculum(EntityManager em, Curriculum curriculum) {
		TypedQuery<DetalleCurriculum> detalleCurriculum = null;
		try {
			em.getTransaction().begin();
			detalleCurriculum = em.createNamedQuery("DetalleCurriculm.buscarPorCurriculum",DetalleCurriculum.class)
					.setParameter("curriculumParam", curriculum);
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return detalleCurriculum.getResultList();
	}

	@Override
	public List<DetalleCurriculum> listarPorTipoCurriculum(EntityManager em, Curriculum curriculum, Detalle detalle) {
		TypedQuery<DetalleCurriculum> detalleCurriculum = null;
		try {
			em.getTransaction().begin();
			detalleCurriculum = em.createNamedQuery("DetalleCurriculum.buscarPorTipoCurriculum", DetalleCurriculum.class)
					.setParameter("curriculumParam", curriculum)
					.setParameter("tipoDetalleCurriculumParam",detalle);
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return detalleCurriculum.getResultList();
	}

}
package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.componentes.ulatina.imantenimiento.IMantenimientoDetalleCurriculum;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.DetalleCurriculum;
import com.componentes.ulatina.modelo.Empleado;

public class ServicioDetalleCurriculum implements IMantenimientoDetalleCurriculum<DetalleCurriculum>{

	@Override
	public void insertar(EntityManager em, DetalleCurriculum obj) {
		em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
	}

	@Override
	public DetalleCurriculum detalleCurriculumPorId(EntityManager em, int id) {
		DetalleCurriculum detalleCurriculum = new DetalleCurriculum();
		return detalleCurriculum;
	}

	@Override
	public List<DetalleCurriculum> listar(EntityManager em) {
		TypedQuery<DetalleCurriculum> detallesCurriculum = em.createNamedQuery("DetalleCurriculum.buscarTodosDetalles", DetalleCurriculum.class);
		return detallesCurriculum.getResultList();
	}

	@Override
	public List<DetalleCurriculum> listarPorTipo(EntityManager em, Detalle detalle) {
		List<DetalleCurriculum> detalleCurriculum = new ArrayList<DetalleCurriculum>();
		return detalleCurriculum;
	}

	@Override
	public List<DetalleCurriculum> listarPorEmpleado(EntityManager em, Empleado empleado) {
		List<DetalleCurriculum> detalleCurriculum = new ArrayList<DetalleCurriculum>();
		return detalleCurriculum;
	}

	@Override
	public List<DetalleCurriculum> listarPorTipoEmpleado(EntityManager em, Empleado empleado, Detalle detalle) {
		List<DetalleCurriculum> detalleCurriculum = new ArrayList<DetalleCurriculum>();
		return detalleCurriculum;
	}

}

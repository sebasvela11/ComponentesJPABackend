package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoDetalleCurriculum;
import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.DetalleCurriculum;
import com.componentes.ulatina.modelo.Empleado;

public class ServicioDetalleCurriculum implements IMantenimientoDetalleCurriculum<DetalleCurriculum>{

	@Override
	public void insertar(EntityManager em, DetalleCurriculum obj) {
		
		
	}

	@Override
	public DetalleCurriculum detalleCurriculumPorId(EntityManager em, int id) {
		DetalleCurriculum detalleCurriculum = new DetalleCurriculum();
		return detalleCurriculum;
	}

	@Override
	public List<DetalleCurriculum> listar(EntityManager em) {
		List<DetalleCurriculum> detalleCurriculum = new ArrayList<DetalleCurriculum>();
		return detalleCurriculum;
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

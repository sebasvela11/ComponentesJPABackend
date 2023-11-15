package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;



public interface IMantenimientoDetalleCurriculum<E> {
	public void insertar(EntityManager em, E obj);
	public E detalleCurriculumPorId(EntityManager em, int id);
	public List<E> listar(EntityManager em);
	public List<E> listarPorTipo(EntityManager em, Detalle detalle);
	public List<E> listarPorEmpleado(EntityManager em, Empleado empleado);
	public List<E> listarPorTipoEmpleado(EntityManager em, Empleado empleado, Detalle detalle);
}
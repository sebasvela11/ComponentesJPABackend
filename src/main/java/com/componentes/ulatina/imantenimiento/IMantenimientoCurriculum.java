package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Empleado;

public interface IMantenimientoCurriculum<E> {
	public void insertar(EntityManager em, E obj);
	public void modificar(EntityManager em, E obj);
	public E curriculumPorId(EntityManager em, int id);
	public E curriculumPorEmpleado(EntityManager em, Empleado empleado);
	public List<E> listar(EntityManager em);

}

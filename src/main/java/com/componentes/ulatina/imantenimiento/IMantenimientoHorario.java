package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

public interface IMantenimientoHorario<E> {
	public void insertar (EntityManager em, E obj);
	public void modificar(EntityManager em, E obj);
	public List<E> listar(EntityManager em);
	public E horarioPorId(EntityManager em, Integer id);
	public E horarioPorEmpleado(EntityManager em, Integer empleado);
	public E horarioPorIdEmpleado(EntityManager em, Integer id, Integer empleado);
	public E calcularIdMaximo(EntityManager em);
}

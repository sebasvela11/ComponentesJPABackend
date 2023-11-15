package com.componentes.ulatina.imantenimiento;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Empleado;


public interface IMantenimientoProyecto <E> {
	public void insertar(EntityManager em, E obj);
	public E proyectoPorId(EntityManager em, int id);
	public List<E> listar(EntityManager em);
	public List<E> listarPorUsuario(EntityManager em, Empleado empleado);
}

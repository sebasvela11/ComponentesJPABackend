package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;
import com.componentes.ulatina.modelo.Proyecto;


public interface IMantenimientoTareaProyecto<E> {
	
	public void insertar(EntityManager em, E obj);
	public E tereaProyectoPorId(EntityManager em, int id);
	public List<E> listar(EntityManager em);
	public List<E> listarPorProyecto(EntityManager em, Proyecto proyecto);
	public List<E> listarPorEmpleado(EntityManager em, Empleado empleado);
	public List<E> listarPorTipo(EntityManager em, Detalle detalle);
	public List<E> listarPorEmpleadoProyecto(EntityManager em, Empleado empleado, Proyecto proyecto);
}

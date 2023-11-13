package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Empleado;

public interface IMantenimientoEmpleado<E> {
	
	public void insertar (EntityManager em, E obj);
	public Empleado validarUsuario(EntityManager em, String creedencial, String contrasena);
	public Empleado empleadoPorId(EntityManager em, int id);
	public List<E> listar(EntityManager em);
}

package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Detalle;


public interface IMantenimientoEmpleado<E> {
	
	public void insertar (EntityManager em, E obj);
	public E validarUsuario(EntityManager em, String creedencial, String contrasena);
	public E empleadoPorId(EntityManager em, int id);
	public List<E> listar(EntityManager em);
	public List<E> listarPorRol(EntityManager em, Detalle detalle);
}
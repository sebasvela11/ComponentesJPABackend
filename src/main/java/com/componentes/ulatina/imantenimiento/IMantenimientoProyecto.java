package com.componentes.ulatina.imantenimiento;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Proyecto;


public interface IMantenimientoProyecto <E> {
	public void insertar(EntityManager em, E obj);
	public Proyecto proyectoPorId(EntityManager em, int id);
	public List<E> listar(EntityManager em);
}

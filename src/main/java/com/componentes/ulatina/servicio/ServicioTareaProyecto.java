package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoTareaProyecto;
import com.componentes.ulatina.modelo.Detalle;
import com.componentes.ulatina.modelo.Empleado;
import com.componentes.ulatina.modelo.Proyecto;
import com.componentes.ulatina.modelo.TareaProyecto;

public class ServicioTareaProyecto implements IMantenimientoTareaProyecto<TareaProyecto>{

	@Override
	public void insertar(EntityManager em, TareaProyecto obj) {
		
		
	}

	@Override
	public TareaProyecto tereaProyectoPorId(EntityManager em, int id) {
		TareaProyecto tareaProyecto = new TareaProyecto();
		return tareaProyecto;
	}

	@Override
	public List<TareaProyecto> listar(EntityManager em) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorProyecto(EntityManager em, Proyecto proyecto) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorEmpleado(EntityManager em, Empleado empleado) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorEmpleadoProyecto(EntityManager em, Empleado empleado, Proyecto proyecto) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

	@Override
	public List<TareaProyecto> listarPorTipo(EntityManager em, Detalle detalle) {
		List<TareaProyecto> tareasProyecto = new ArrayList<TareaProyecto>();
		return tareasProyecto;
	}

}

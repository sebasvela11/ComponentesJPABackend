package com.componentes.ulatina.servicio;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.*;
import com.componentes.ulatina.modelo.*;

public class ServicioEmpleado implements IMantenimientoEmpleado<Empleado>{

	@Override
	public void insertar (EntityManager em, Empleado empleado) {
	}
	
	@Override
	public Empleado validarUsuario(EntityManager em, String creedencial, String contrasena) {
		Empleado empleado = new Empleado();
		return empleado;
	}
	
	@Override
	public Empleado empleadoPorId(EntityManager em, int id) {
		Empleado empleado = new Empleado();
		return empleado;
	}
	
	@Override
	public List<Empleado> listar(EntityManager em){
		List<Empleado> empleados = new ArrayList<Empleado>();
		return empleados;
	}
}

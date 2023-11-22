package com.componentes.ulatina.servicio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import com.componentes.ulatina.imantenimiento.*;
import com.componentes.ulatina.modelo.*;

public class ServicioEmpleado implements IMantenimientoEmpleado<Empleado>{

	@Override
	public void insertar (EntityManager em, Empleado empleado) {
		try {
			em.getTransaction().begin();
			em.persist(empleado);
			em.getTransaction().commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Empleado validarUsuario(EntityManager em, String creedencial, String contrasena) {
		Empleado empleado = new Empleado();
		try {
			empleado = (Empleado) em.createNamedQuery("Empleado.validarUsuario")
					.setParameter("correoEmpresaParam", new String(creedencial)).setParameter("contrasenaParam", new String(contrasena)).getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empleado;
	}
	
	@Override
	public Empleado empleadoPorId(EntityManager em, int id) {
		Empleado empleado = new Empleado();
		try {
			empleado = (Empleado) em.createNamedQuery("Empleado.buscarPorId")
					.setParameter("idParam", new Integer(id)).getSingleResult();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return empleado;
	}
	
	@Override
	public List<Empleado> listar(EntityManager em){
		TypedQuery<Empleado> empleados = null;
		try {
			empleados = em.createNamedQuery("Empleado.buscarTodosEmpleados", Empleado.class);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empleados.getResultList();
	}

	@Override
	public List<Empleado> listarPorRol(EntityManager em, Detalle detalle) {
		TypedQuery<Empleado> empleados = null;
		try {
			empleados = em.createNamedQuery("Empleado.buscarPorRol", Empleado.class).setParameter("detalleParam", detalle);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return empleados.getResultList();
	}
}

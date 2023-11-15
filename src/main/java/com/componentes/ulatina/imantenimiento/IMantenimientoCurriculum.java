package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;
import com.componentes.ulatina.modelo.Empleado;

public interface IMantenimientoCurriculum<E> {


    public void insertar (EntityManager em, E obj);
    public E curriculumPorEmpleado(EntityManager em, Empleado empleado );
    public E curriculumPorId(EntityManager em, int id);
    public List<E> listar(EntityManager em);

}
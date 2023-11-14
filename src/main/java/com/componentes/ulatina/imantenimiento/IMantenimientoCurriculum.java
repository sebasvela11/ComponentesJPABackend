package com.componentes.ulatina.imantenimiento;

import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Empleado;

public interface IMantenimientoCurriculum<E> {


    public void insertar (EntityManager em, E obj);
    public Curriculum curriculumPorEmpleado(EntityManager em, Empleado empleado );
    public Curriculum curriculumPorId(EntityManager em, int id);
    public List<E> listar(EntityManager em);

}
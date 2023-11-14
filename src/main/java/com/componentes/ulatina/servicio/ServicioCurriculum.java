package com.componentes.ulatina.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.componentes.ulatina.imantenimiento.IMantenimientoCurriculum;
import com.componentes.ulatina.modelo.Curriculum;
import com.componentes.ulatina.modelo.Empleado;

public class ServicioCurriculum implements IMantenimientoCurriculum<Curriculum>{
	@Override
    public void insertar(EntityManager em, Curriculum obj) {

    }

    @Override
    public Curriculum curriculumPorEmpleado(EntityManager em, Empleado empleado) {
        Curriculum curriculum = new Curriculum();
        return curriculum;
    }

    @Override
    public Curriculum curriculumPorId(EntityManager em, int id) {
        Curriculum curriculum = new Curriculum();
        return curriculum;

    }

    @Override
    public List<Curriculum> listar(EntityManager em) {
        List<Curriculum> curriculums = new ArrayList<Curriculum> ();
        return curriculums;
    }
}

package com.componentes.ulatina.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@NamedQueries(value = {
		@NamedQuery(name = "Curriculum.buscarTodosCurriculums", query = "SELECT c FROM Curriculum c"),
		@NamedQuery (name = "Curriculum.CurriculumPorId", query = "SELECT c FROM  Curriculum c WHERE c.id = :idParam"),
		@NamedQuery (name = "Curriculum.CurriculumPorEmpleado", query = "SELECT c FROM  Curriculum c WHERE c.empleado = :empleadoParam"),
})
@Table(name="comp_curriculum")
public class Curriculum implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "empleado", nullable = false, unique = true)
	private Empleado empleado;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curriculum")
	private List<DetalleCurriculum> listaDetalleCurriculum;
	
	public Curriculum() {

	}

	public Curriculum(Empleado empleado, List<DetalleCurriculum> listaDetalleCurriculum) {
		this.empleado = empleado;
		this.listaDetalleCurriculum = listaDetalleCurriculum;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<DetalleCurriculum> getListaDetalleCurriculum() {
		return listaDetalleCurriculum;
	}

	public void setListaDetalleCurriculum(List<DetalleCurriculum> listaDetalleCurriculum) {
		this.listaDetalleCurriculum = listaDetalleCurriculum;
	}
}

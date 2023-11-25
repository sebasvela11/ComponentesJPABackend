package com.componentes.ulatina.modelo;
import java.io.Serializable;
import java.sql.Date;


import javax.persistence.*;
@Entity
@NamedQueries(value = {
		@NamedQuery(name = "DetalleCurriculum.buscarTodosDetalles", query = "SELECT dc FROM DetalleCurriculum dc"),
		@NamedQuery (name = "DetalleCurriculum.detalleCurriculumPorId", query = "SELECT dc FROM  DetalleCurriculum dc WHERE dc.id = :idParam"),
		@NamedQuery (name = "DetalleCurriculum.buscarPorTipo", query = "SELECT dc FROM DetalleCurriculum dc WHERE dc.tipoDetalleCurriculum = :detalleParam"),
		@NamedQuery (name = "DetalleCurriculum.buscarPorEmpleado", query = "SELECT dc FROM DetalleCurriculum dc WHERE dc.empleado = :empleadoParam"),
		@NamedQuery (name = "DetalleCurriculum.buscarPorTipoDeEmpleado", query = "SELECT dc FROM DetalleCurriculum dc WHERE dc.empleado = :empleadoParam AND dc.tipoDetalleCurriculum = :tipoDetalleCurriculumParam" )})
@Table(name="comp_detalle_curriculum")

public class DetalleCurriculum implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "titulo", nullable = false)
	String titulo;
	@Column(name = "descripcion ", nullable = false)
	String descripcion;
	@Column(name = "fechaInicio ", nullable = false)
	Date fechaInicio;
	@Column(name = "fechaFinal ", nullable = false)
	Date fechaFinal;
	@ManyToOne
	@JoinColumn(name = "tipoDetalleCurriculum", nullable = false)
	Detalle tipoDetalleCurriculum;
	@ManyToOne
	@JoinColumn(name = "empleado", nullable = false)
	Empleado empleado;
	
	public DetalleCurriculum() {
		
	}
	public DetalleCurriculum( String titulo, String descripcion, Date fechaInicio, Date fechaFinal,
			Detalle tipoDetalleCurriculum, Empleado empleado) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.tipoDetalleCurriculum = tipoDetalleCurriculum;
		this.empleado = empleado;
	}
	public DetalleCurriculum(int id, String titulo, String descripcion, Date fechaInicio, Date fechaFinal,
			Detalle tipoDetalleCurriculum, Empleado empleado) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.tipoDetalleCurriculum = tipoDetalleCurriculum;
		this.empleado = empleado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public Detalle getTipoDetalleCurriculum() {
		return tipoDetalleCurriculum;
	}
	public void setTipoDetalleCurriculum(Detalle tipoDetalleCurriculum) {
		this.tipoDetalleCurriculum = tipoDetalleCurriculum;
	}
	public Empleado getCurriculum() {
		return empleado;
	}
	public void setCurriculum(Empleado empleado) {
		this.empleado = empleado;
	}
}
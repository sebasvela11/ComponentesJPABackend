package com.componentes.ulatina.modelo;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;


import javax.persistence.*;
@Entity
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
	@JoinColumn(name = "curriculum", nullable = false)
	Curriculum curriculum;
	
	public DetalleCurriculum() {
		
	}
	public DetalleCurriculum(int id, String titulo, String descripcion, Date fechaInicio, Date fechaFinal,
			Detalle tipoDetalleCurriculum, Curriculum curriculum) {
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.tipoDetalleCurriculum = tipoDetalleCurriculum;
		this.curriculum = curriculum;
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
	public Curriculum getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}
}

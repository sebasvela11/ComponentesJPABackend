package com.componentes.ulatina.modelo;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@NamedQueries(value = {
		@NamedQuery(name = "TareaProyecto.buscarTodasTareas", query = "SELECT tp FROM TareaProyecto tp")})
@Table(name = "comp_tarea_proyecto")
public class TareaProyecto implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@ManyToOne
	@JoinColumn(name = "proyecto", nullable = false)
	Proyecto proyecto;
	@ManyToOne
	@JoinColumn(name = "empleado", nullable = false)
	Empleado empleado;
	@Column(name = "tituloTarea", nullable = false)
	String tituloTarea;
	@Column(name = "tiempoInvertido", nullable = false)
	Double tiempoInvertido;
	@ManyToOne
	@JoinColumn(name = "tipoTarea", nullable = false)
	Detalle tipoTarea;
	@ManyToOne
	@JoinColumn(name = "estado", nullable = false)
	Detalle estado;
	public TareaProyecto() {
		
	}
	public TareaProyecto(int id, Proyecto proyecto, Empleado empleado, String tituloTarea, Double tiempoInvertido,
			Detalle tipoTarea, Detalle estado) {
		this.id = id;
		this.proyecto = proyecto;
		this.empleado = empleado;
		this.tituloTarea = tituloTarea;
		this.tiempoInvertido = tiempoInvertido;
		this.tipoTarea = tipoTarea;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public String getTituloTarea() {
		return tituloTarea;
	}
	public void setTituloTarea(String tituloTarea) {
		this.tituloTarea = tituloTarea;
	}
	public Double getTiempoInvertido() {
		return tiempoInvertido;
	}
	public void setTiempoInvertido(Double tiempoInvertido) {
		this.tiempoInvertido = tiempoInvertido;
	}
	public Detalle getTipoTarea() {
		return tipoTarea;
	}
	public void setTipoTarea(Detalle tipoTarea) {
		this.tipoTarea = tipoTarea;
	}
	public Detalle getEstado() {
		return estado;
	}
	public void setEstado(Detalle estado) {
		this.estado = estado;
	}
}

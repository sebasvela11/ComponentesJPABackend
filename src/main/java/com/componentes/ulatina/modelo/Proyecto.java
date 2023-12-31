package com.componentes.ulatina.modelo;
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;


@Entity
@NamedQueries(value = {
@NamedQuery(name = "Proyecto.buscarTodosProyectos", query = "SELECT p FROM Proyecto p"),
@NamedQuery(name = "Proyecto.buscarPorId", query = "SELECT p FROM Proyecto p WHERE p.id = :idParam"),
@NamedQuery(name = "Proyecto.buscarPorEstado", query = "SELECT P FROM Proyecto p WHERE p.estado = :estadoParam ")})
@NamedNativeQueries({
	@NamedNativeQuery(name = "Proyecto.buscarPorEstadoEmpleado", query = "SELECT DISTINCT p.* FROM comp_proyecto p JOIN comp_tarea_proyecto tp ON p.id = tp.proyecto WHERE tp.empleado = :idUsuarioParam AND p.estado = :idEstadoParam", resultClass = Proyecto.class),
	@NamedNativeQuery(name = "Proyecto.buscarPorEmpleado", query = "SELECT DISTINCT p.* FROM comp_proyecto p JOIN comp_tarea_proyecto tp ON p.id = tp.proyecto WHERE tp.empleado = :idUsuarioParam", resultClass = Proyecto.class)})
@Table(name = "comp_proyecto")

public class Proyecto implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	@Column(name = "fechaInicio ", nullable = false)
	private Date fechaInicio;
	@Column(name = "fechaFinal ", nullable = false)
	private Date fechaFinal;
	@ManyToOne
	@JoinColumn(name = "estado", nullable = false)
	private Detalle estado;
	
	public Proyecto() {
		
	}
	public Proyecto( String nombre, String descripcion, Date fechaInicio, Date fechaFinal, Detalle estado) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.estado = estado;
	}
	public Proyecto(int id, String nombre, String descripcion, Date fechaInicio, Date fechaFinal, Detalle estado) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public Detalle getEstado() {
		return estado;
	}
	public void setEstado(Detalle estado) {
		this.estado = estado;
	}
}
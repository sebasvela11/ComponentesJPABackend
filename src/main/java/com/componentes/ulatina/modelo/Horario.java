package com.componentes.ulatina.modelo;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.*;

@Entity
@IdClass(HorarioPK.class)
@NamedQueries(value = {
		@NamedQuery(name = "Horario.buscarTodosHorarios", query = "SELECT h FROM Horario h"),
		@NamedQuery(name = "Horario.buscarPorId", query = "SELECT h FROM Horario h WHERE h.id = :idParam"),
		@NamedQuery(name = "Horario.buscarPorEmpleado", query = "SELECT h FROM Horario h WHERE h.empleado = :empleadoParam"),
		@NamedQuery(name = "Horario.buscarPorIdEmpleado", query = "SELECT h FROM Horario h WHERE h.empleado = :empleadoParam AND h.id = :idParam")})
@Table(name = "comp_horario")
public class Horario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Id
	@Column(name = "empleado", nullable = false, unique = true)
	private Integer empleado;
	@Column(name = "diasLaborales ", nullable = false)
	private Integer diasLaborales;
	@Column(name = "horaEntrada ", nullable = false)
	private Time  horaEntrada;
	@Column(name = "horaSalida ", nullable = false)
	private Time  horaSalida;
	
	public Horario() {
		
	}

	public Horario(Integer id, Integer empleado, Integer diasLaborales, Time horaEntrada, Time horaSalida) {
		super();
		this.id = id;
		this.empleado = empleado;
		this.diasLaborales = diasLaborales;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Integer empleado) {
		this.empleado = empleado;
	}

	public Integer getDiasLaborales() {
		return diasLaborales;
	}

	public void setDiasLaborales(Integer diasLaborales) {
		this.diasLaborales = diasLaborales;
	}

	public Time getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	
}

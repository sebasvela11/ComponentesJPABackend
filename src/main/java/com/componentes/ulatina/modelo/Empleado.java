package com.componentes.ulatina.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "comp_empleado")
public class Empleado implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "nombre ", nullable = false)
	String nombre;
	@Column(name = "apellidos ", nullable = false)
	String apellidos;
	@Column(name = "correoEmpresa ", nullable = false, unique = true)
	String correoEmpresa;
	@Column(name = "correoPersonal ", nullable = false, unique = true)
	String correoPersonal;
	@Column(name = "numeroTelefono ", nullable = false, unique = true)
	String numeroTelefono;
	@Column(name = "edad ", nullable = false)
	int edad;
	@ManyToOne
	@JoinColumn(name = "genero", nullable = false)
	Detalle genero;
	@ManyToOne
	@JoinColumn(name = "rol", nullable = false)
	Detalle rol;
	public Empleado() {

	}
	public Empleado(int id, String nombre, String apellidos, String correoEmpresa, String correoPersonal,
			String numeroTelefono, int edad, Detalle genero, Detalle rol) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correoEmpresa = correoEmpresa;
		this.correoPersonal = correoPersonal;
		this.numeroTelefono = numeroTelefono;
		this.edad = edad;
		this.genero = genero;
		this.rol = rol;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreoEmpresa() {
		return correoEmpresa;
	}
	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}
	public String getCorreoPersonal() {
		return correoPersonal;
	}
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Detalle getGenero() {
		return genero;
	}
	public void setGenero(Detalle genero) {
		this.genero = genero;
	}
	public Detalle getRol() {
		return rol;
	}
	public void setRol(Detalle rol) {
		this.rol = rol;
	}
}

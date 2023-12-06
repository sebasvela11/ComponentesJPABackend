package com.componentes.ulatina.modelo;
import java.io.Serializable;

import javax.persistence.*;
@Entity
//@IdClass(TareaProyectoPK.class)
@NamedQueries(value = {
        @NamedQuery(name = "TareaProyecto.buscarTodasTareas", query = "SELECT tp FROM TareaProyecto tp"),
        @NamedQuery(name = "TareaProyecto.buscarPorId", query = "SELECT t FROM TareaProyecto t WHERE t.id = :idParam"),
        @NamedQuery(name = "TareaProyecto.buscarPorProyecto", query = "SELECT t FROM TareaProyecto t WHERE t.proyecto = :proyectoParam"),
        @NamedQuery(name = "TareaProyecto.buscarPorEmpleado", query = "SELECT t FROM TareaProyecto t WHERE t.empleado = :empleadoParam"),
        @NamedQuery(name = "TareaProyecto.buscarPorEmpleadoProyecto", query = "SELECT t FROM TareaProyecto t WHERE t.empleado = :empleadoParam AND t.proyecto = :proyectoParam"),
        @NamedQuery(name = "TareaProyecto.buscarPorTipo", query = "SELECT t FROM TareaProyecto t WHERE t.tipoTarea = :tipoTareaParam")
})
@Table(name = "comp_tarea_proyecto")
public class TareaProyecto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//@Id
	@ManyToOne
    @JoinColumn(name = "proyecto", nullable = false)
    private Proyecto proyecto;
	
	//@Id
    @ManyToOne
    @JoinColumn(name = "empleado", nullable = false)
    private Empleado empleado;

    @Column(name = "tituloTarea", nullable = false)
    private String tituloTarea;

    @Column(name = "tiempoInvertido", nullable = false)
    private Double tiempoInvertido;

    @ManyToOne
    @JoinColumn(name = "tipoTarea", nullable = false)
    private Detalle tipoTarea;

    @ManyToOne
    @JoinColumn(name = "estado", nullable = false)
    private Detalle estado;
    
    public TareaProyecto() {
        
    }
    
    public TareaProyecto(int id, Proyecto proyecto, Empleado empleado, String tituloTarea, Double tiempoInvertido,
                    Detalle tipoTarea, Detalle estado) {
    	this.id = id;
        this.tituloTarea = tituloTarea;
        this.tiempoInvertido = tiempoInvertido;
        this.tipoTarea = tipoTarea;
        this.estado = estado;
        this.proyecto = proyecto;
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
}

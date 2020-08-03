package com.Leather.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "materiales")
public class Material implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	// ----------------- variables de la tabla matertiales --------------------- //
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(nullable = false)
	private String nombre;
	private String descripcion;
	
	
	
	// ----------------------------- variables de auditoría --------------------//
	
		@Column(name = "fecha_registro")
		@Temporal(TemporalType.DATE)
		@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.ANY)
		private Date fechaRegistro;
		
		@Column(name="hora_registro")
		@Temporal(TemporalType.TIME)
		@JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.ANY)
		private Date horaRegistro;
		
		@Column(name="fecha_modificacion")
		@Temporal(TemporalType.DATE)
		@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.ANY)
		private Date fechaModificacion;
		
		@Column(name="hora_modificacion")
		@Temporal(TemporalType.TIME)
		@JsonFormat(pattern = "HH:mm:ss", shape = JsonFormat.Shape.ANY)
		private Date horaModificacion;

		

		//------------------- GETTERS y SETTERS ------------------------------------ //
	
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
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

		public Date getFechaRegistro() {
			return fechaRegistro;
		}

		public void setFechaRegistro(Date fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}

		public Date getHoraRegistro() {
			return horaRegistro;
		}

		public void setHoraRegistro(Date horaRegistro) {
			this.horaRegistro = horaRegistro;
		}

		public Date getFechaModificacion() {
			return fechaModificacion;
		}

		public void setFechaModificacion(Date fechaModificacion) {
			this.fechaModificacion = fechaModificacion;
		}

		public Date getHoraModificacion() {
			return horaModificacion;
		}

		public void setHoraModificacion(Date horaModificacion) {
			this.horaModificacion = horaModificacion;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	
		
		
		// ------------------- acciones automáticas ---------------------------- //
		
		@PrePersist
		public void asignaFechaRegistro(){
			this.fechaRegistro = new Date();
			this.horaRegistro = new Date();
		}
		
		@PreUpdate
		public void asignaFechaModificacion(){
			this.fechaModificacion = new Date();
			this.horaModificacion = new Date();
		}

		
		
		
		
		
}
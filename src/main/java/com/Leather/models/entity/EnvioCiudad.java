package com.Leather.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.Leather.models.entity.TipoEnvio;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "envios_ciudad")
public class EnvioCiudad implements Serializable { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Postgrest 
	private Long id;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JsonIgnoreProperties(value = {"envioCiudad","listaEnvioCiudad","handler", "hibernateLazyInitializer"})
	private TipoEnvio tipoEnvio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"listaEnvioCiudad", "clientes", "proveedores", "handler", "hibernateLazyInitializer"})
	private Ciudad ciudad;
		
	@ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value={"listaEstadoEnvioCiudad", "empresaTransportadora","listaEnvioCiudad", "hibernateLazyInitializer"})
	private EmpresaTransportadora empresaTransportadora;
	
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "envioCiudad")
	@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
	private List<EstadoEnvioCiudad> listaEstadoEnvioCiudad;*/
		
	@Column(name="valor_envio")
	private Double valorEnvio;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoEnvio getTipoEnvio() {
		return tipoEnvio;
	}
	public void setTipoEnvio(TipoEnvio tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Double getValorEnvio() {
		return valorEnvio;
	}
	public void setValorEnvio(Double valorEnvio) {
		this.valorEnvio = valorEnvio;
	}
	public EmpresaTransportadora getEmpresaTransportadora() {
		return empresaTransportadora;
	}
	public void setEmpresaTransportadora(EmpresaTransportadora empresaTransportadora) {
		this.empresaTransportadora = empresaTransportadora;
	}
	/*
	public List<EstadoEnvioCiudad> getListaEstadoEnvioCiudad() {
		return listaEstadoEnvioCiudad;
	}
	public void setListaEstadoEnvioCiudad(List<EstadoEnvioCiudad> listaEstadoEnvioCiudad) {
		this.listaEstadoEnvioCiudad = listaEstadoEnvioCiudad;
	}
	public void addEstadoEnvioCiudad(EstadoEnvioCiudad estadoEnvioCiudad) {
		this.listaEstadoEnvioCiudad.add(estadoEnvioCiudad);
	}*/



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


// Json
	
}

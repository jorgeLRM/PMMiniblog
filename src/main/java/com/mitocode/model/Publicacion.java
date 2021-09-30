package com.mitocode.model;

import java.io.Serializable;
import java.util.List;

public class Publicacion implements Serializable {

	private Integer id;

	private Persona publicador;

	private String cuerpo;

	private List<Tag> tags;

	private List<Mencion> menciones;

	public Publicacion() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona getPublicador() {
		return publicador;
	}

	public void setPublicador(Persona publicador) {
		this.publicador = publicador;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Mencion> getMenciones() {
		return menciones;
	}

	public void setMenciones(List<Mencion> menciones) {
		this.menciones = menciones;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

}

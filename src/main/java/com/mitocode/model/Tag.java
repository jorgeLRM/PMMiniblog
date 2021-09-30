package com.mitocode.model;

import java.io.Serializable;

public class Tag implements Serializable {

	private Integer id;

	private Publicacion publicacion;

	private String texto;

	public Tag() {
	}

	public Tag(Publicacion publicacion, String texto) {
		this.publicacion = publicacion;
		this.texto = texto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

}

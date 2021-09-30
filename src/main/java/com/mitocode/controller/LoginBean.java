package com.mitocode.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Named
@SessionScoped
public class LoginBean implements Serializable {

	private String usuario;
	private String clave;
	private final Client CLIENT = ClientBuilder.newClient();
	
	public String login() {
		try {
			String API = "http://localhost:8080/RESTMiniBlog/rest/usuarios/login";
			WebTarget target = CLIENT.target(API);

			Form form = new Form();
			form.param("email", usuario);
			form.param("password", clave);

			Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
					.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));

			if (response.getStatus() == 200) {
				String token = response.getHeaderString(HttpHeaders.AUTHORIZATION);
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("token", token);
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);

				return "/protegido/mis_publicaciones.xhtml?faces-redirect=true";
			}
		} catch (Exception e) {
			return "index?faces-redirect=true";
		}
		return "index?faces-redirect=true";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Client getCLIENT() {
		return CLIENT;
	}
}

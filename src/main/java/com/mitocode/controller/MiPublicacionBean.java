package com.mitocode.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mitocode.model.Publicacion;
import com.mitocode.model.Usuario;

@Named
@ViewScoped
public class MiPublicacionBean implements Serializable {
	
	@Inject
	private LoginBean loginBean;
	private List<Publicacion> publicaciones;
	
	@PostConstruct
	public void init() {
		this.listar();
	}
	
	public void listar() {
		try {
			String API = "http://localhost:8080/RESTMiniBlog/rest/publicaciones/listar/{id}";
			
			Usuario user = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user_session");
			
	        WebTarget target = loginBean.getCLIENT().target(API).resolveTemplate("id", user.getId());
	        
	        String token = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("token");
	        
	        String response = target.request(MediaType.APPLICATION_JSON_TYPE).header(HttpHeaders.AUTHORIZATION, token).get(String.class);
			Gson g = new Gson();
			publicaciones = g.fromJson(response, new TypeToken<ArrayList<Publicacion>>() {}.getType());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
}

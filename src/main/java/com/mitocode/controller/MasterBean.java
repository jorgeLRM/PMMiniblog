package com.mitocode.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.mitocode.model.Usuario;

@Named
@ViewScoped
public class MasterBean implements Serializable{
	
	@Inject
	private LoginBean loginBean;
	
	public void verificarSesion() throws Exception {
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			String nombre = (String) context.getExternalContext().getSessionMap().get("usuario");

			String API = "http://localhost:8080/RESTMiniBlog/rest/usuarios/{nombre}";

			WebTarget target = loginBean.getCLIENT().target(API).resolveTemplate("nombre", nombre);

			String token = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("token");

			String response = target.request(MediaType.APPLICATION_JSON_TYPE).header(HttpHeaders.AUTHORIZATION, token)
					.get(String.class);

			Gson g = new Gson();
			Usuario user = g.fromJson(response, Usuario.class);
			
			if (user == null || user.getId() == 0) {
				context.getExternalContext().redirect("./../index.xhtml");
			}else {
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user_session", user);
			}

		} catch (Exception e) {
			FacesContext.getCurrentInstance().getExternalContext().redirect("./../index.xhtml");
		}
	}

}

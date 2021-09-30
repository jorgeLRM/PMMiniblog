package com.mitocode.controller;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.mitocode.model.Persona;
import com.mitocode.model.Publicacion;
import com.mitocode.model.Usuario;

@Named
@ViewScoped
public class PublicacionBean implements Serializable {
	

	@Inject
	private LoginBean loginBean;

	private String texto;
	
	public void publicar() {
		try {
			
			String API = "http://localhost:8080/RESTMiniBlog/rest/publicaciones/publicar";
			
	        WebTarget target = loginBean.getCLIENT().target(API);	        

			String token = (String) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("token");
	        Usuario user = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user_session");
	        
	        Publicacion publi = new Publicacion();
	        publi.setCuerpo(texto);
	        Persona per = new Persona();
	        per.setIdPersona(user.getId());
	        publi.setPublicador(per);
	        
	        String response = target.request(MediaType.APPLICATION_JSON_TYPE).header(HttpHeaders.AUTHORIZATION, token).post(Entity.json(publi), String.class);
	        		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
}

package com.mitocode.controller;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.mitocode.model.Usuario;
import com.mitocode.service.impl.Rol;
import com.mitocode.service.impl.RolServiceImpl;
import com.mitocode.service.impl.RolServiceImplService;

@Named
@ViewScoped
public class RolBean implements Serializable {

	private List<Rol> lista;

	@PostConstruct
	public void init() {
		this.listar();
	}

	public void listar() {
		try {
			RolServiceImplService rolServiceImplService = new RolServiceImplService();
			RolServiceImpl rolService = rolServiceImplService.getRolServiceImplPort();

			Map<String, Object> reqMap = ((BindingProvider) rolService).getRequestContext();
			reqMap.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/SOAPMiniBlog/RolServiceImpl?wsdl");

			Usuario user = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
					.get("user_session");

			Map<String, List<String>> header = new HashMap<>();
			header.put("usuario", Collections.singletonList(user.getUsuario()));
			header.put("clave", Collections.singletonList("123"));
			reqMap.put(MessageContext.HTTP_REQUEST_HEADERS, header);

			this.lista = rolService.listar();

		} catch (Exception e) {

		}
	}

	public List<Rol> getLista() {
		return lista;
	}

	public void setLista(List<Rol> lista) {
		this.lista = lista;
	}

}

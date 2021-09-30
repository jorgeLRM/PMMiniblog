package com.mitocode.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import com.mitocode.model.Usuario;

@WebServlet("/imagen/*")
public class ImageServlet extends HttpServlet {

	@Inject
	private LoginBean loginBean;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			String API = "http://localhost:8080/RESTMiniBlog/rest/personas/foto/{id}";					

			//Usuario user = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user_session");
			Usuario user = (Usuario) req.getSession().getAttribute("user_session");

			WebTarget target = loginBean.getCLIENT().target(API).resolveTemplate("id", user.getId());

			String token = (String)  req.getSession().getAttribute("token");

			Response foto = target.request("application/octet-stream")
					.header(HttpHeaders.AUTHORIZATION, token).get();	
			
			byte[] arregloBytes = foto.readEntity(byte[].class);

			if (foto != null) {
				resp.setContentType(getServletContext().getMimeType("image/png"));
				resp.setContentLength(arregloBytes.length);
				resp.getOutputStream().write(arregloBytes);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

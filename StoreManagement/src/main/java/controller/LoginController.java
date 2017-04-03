package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Authenticator;
import model.AuthenticatorResponse;
import model.AuthenticatorStatus;

/**
 * @author Johnny Lopes
 *
 */
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = -4015599647677928668L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher reqDispatcher = null;

		Authenticator authenticator = new Authenticator();
		AuthenticatorResponse authResp = authenticator.authenticate(username, password);
		AuthenticatorStatus authStatus = authResp.getStatus();
		if (authStatus.equals(AuthenticatorStatus.AUTHENTICATED)) {
			reqDispatcher = request.getRequestDispatcher("/success.html");
		} else {
			reqDispatcher = request.getRequestDispatcher("/error.html");
		}
		reqDispatcher.forward(request, response);
	}
}

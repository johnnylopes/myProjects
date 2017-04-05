package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.dao.UserDAO;
import model.exception.DAOException;

/**
 * @author Johnny Lopes
 *
 */
@Path("/user")
public class UserController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public Response getUsers() throws DAOException {
		UserDAO userdao = new UserDAO();
		return Response.ok(userdao.list()).build();
	}
}

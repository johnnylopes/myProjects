package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

	private UserDAO userdao = new UserDAO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public Response getUsers() throws DAOException {
		return Response.ok(userdao.list()).build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("id") Integer id) throws DAOException {
		return Response.ok(userdao.findById(id)).build();
	}

}

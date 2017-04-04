package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.dao.UserDAO;

/**
 * @author Johnny Lopes
 *
 */
@Path("/user")
public class UserController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public Response getUsers() {
		return Response.ok(UserDAO.getUsers()).build();
	}
}

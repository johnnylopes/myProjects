package model;

/**
 * @author Johnny Lopes
 *
 */
public class Authenticator {

	public AuthenticatorResponse authenticate(String login, String password) {

		AuthenticatorResponse auth = new AuthenticatorResponse(AuthenticatorStatus.NOT_AUTHENTICATED);

		if (login.equalsIgnoreCase("test") && password.equals("test123")) {
			auth.setStatus(AuthenticatorStatus.AUTHENTICATED);
		}
		return auth;
	}
}

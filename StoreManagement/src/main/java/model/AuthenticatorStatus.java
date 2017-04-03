package model;

/**
 * @author Johnny Lopes
 *
 */
public enum AuthenticatorStatus {
	AUTHENTICATED(0, "User authenticated!"), NOT_AUTHENTICATED(1, "User not authenticated!"), AUTHENTICATION_ERROR(3,
			"Error in authentication");

	private final int code;
	private final String description;

	private AuthenticatorStatus(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return code + ": " + description;
	}
}

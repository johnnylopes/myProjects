package model;

/**
 * @author Johnny Lopes
 *
 */
public class AuthenticatorResponse {

	private AuthenticatorStatus status;
	private Exception exception;

	public AuthenticatorResponse(AuthenticatorStatus status) {
		this.status = status;
	}

	public AuthenticatorResponse(AuthenticatorStatus status, Exception e) {
		this.status = status;
		this.exception = e;
	}

	public AuthenticatorStatus getStatus() {
		return status;
	}

	public void setStatus(AuthenticatorStatus status) {
		this.status = status;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

}

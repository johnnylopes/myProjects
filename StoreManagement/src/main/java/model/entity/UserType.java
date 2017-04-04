package model.entity;

/**
 * @author Johnny Lopes
 *
 */
public enum UserType {

	CLIENT(0), EMPLOYEE(1), ADMIN(2);

	private final int value;

	UserType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

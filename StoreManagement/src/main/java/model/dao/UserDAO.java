package model.dao;

import model.entity.User;

/**
 * @author Johnny Lopes
 *
 */
public class UserDAO extends GenericDAO {

	@Override
	public Class<?> getEntityClass() {
		return User.class;
	}
}

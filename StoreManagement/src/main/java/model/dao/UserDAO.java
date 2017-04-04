package model.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import model.entity.User;
import model.util.HibernateUtil;

/**
 * @author Johnny Lopes
 *
 */
public class UserDAO {

	@SuppressWarnings("unchecked")
	public static List<User> getUsers() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		List<User> users = sessionFactory.openSession().createCriteria(User.class).list();
		return users;
	}
}

package model.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

/**
 * @author Johnny Lopes
 *
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			synchronized (SessionFactory.class) {
				if (sessionFactory == null) {
					try {
						Configuration configuration = new Configuration().configure();
						StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
								.applySettings(configuration.getProperties());
						sessionFactory = configuration.buildSessionFactory(builder.build());
					} catch (Throwable e) {
						throw new SessionException("Could not load the session.", e);
					}
				}
			}
		}
		return sessionFactory;
	}

	public static Connection getConnection() {
		try {
			return getSessionFactory().getSessionFactoryOptions().getServiceRegistry()
					.getService(ConnectionProvider.class).getConnection();
		} catch (SQLException e) {
			throw new SessionException("Could not get the connection.", e);
		}
	}

	public static void closeSession() {
		getSessionFactory().close();
	}

	/*
	 * public static void main(String[] args) { User person = new User();
	 * person.setAddress("teste addresss"); person.setEmail("teste@gmail.com");
	 * person.setLogin("teste"); person.setPassword("1234");
	 * person.setName("teste"); person.setPhoneNumber("12345");
	 * person.setSurname("tsur"); person.setType(UserType.ADMIN); Session
	 * session = HibernateUtil.getSessionFactory().openSession();
	 * session.beginTransaction(); session.save(person);
	 * session.getTransaction().commit(); session.close();
	 * System.out.println("Done"); }
	 */
}

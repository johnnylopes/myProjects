package model.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.exception.DAOException;
import model.util.HibernateUtil;

/**
 * @author Johnny Lopes
 *
 */
public abstract class GenericDAO {

	private List<?> list(Class<?> entity) throws DAOException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<?> list = new ArrayList<>();
		try {
			list = session.createCriteria(entity).list();
		} catch (RuntimeException e) {
			throw new DAOException("Generic list error: " + e.getLocalizedMessage(), e);
		} finally {
			session.close();
		}
		return list;
	}

	private Object findById(Class<?> entity, Integer id) throws DAOException {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Object object = new Object();
		try {
			object = session.get(entity, id);
		} catch (RuntimeException e) {
			throw new DAOException("Generic find by Id error: " + e.getLocalizedMessage(), e);
		} finally {
			session.close();
		}
		return object;
	}

	public List<?> list() throws DAOException {
		return this.list(getEntityClass());
	}

	public Object findById(Integer id) throws DAOException {
		return this.findById(getEntityClass(), id);
	}

	public abstract Class<?> getEntityClass();

}

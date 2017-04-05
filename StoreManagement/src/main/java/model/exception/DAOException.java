/**
 * 
 */
package model.exception;

/**
 * @author Johnny Lopes
 *
 */
public class DAOException extends Exception {

	private static final long serialVersionUID = 5498365311695693706L;

	public DAOException(String message, Exception e) {
		super(message, e);
	}
}

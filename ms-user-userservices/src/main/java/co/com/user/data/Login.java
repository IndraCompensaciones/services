package co.com.user.data;

import java.io.Serializable;

/**
 * clase que contiene la informacion el login del usuario
 * 
 * @author Administrador
 *
 */
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** usuario */
	private String user;
	/** contrasena */
	private String password;

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public Login(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

}

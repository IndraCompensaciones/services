package co.com.user.data;

import java.io.Serializable;

/**
 * clase que permite mostrar la informacion del usuario
 * 
 * @author Administrador
 *
 */
public class UserLibraryData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idUser;
	
	private String nameUser;

	private String lastName;

	private String userPassword;

	private String email;

	private String userLogin;
	
	public UserLibraryData() {
		
	}
	
	public UserLibraryData(Long idUser, String nameUser, String lastName, String userPassword, String email, String userLogin) {
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.lastName = lastName;
		this.userPassword = userPassword;
		this.email = email;
		this.userLogin = userLogin;
	}

	public String getNameUser() {
		return nameUser;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getEmail() {
		return email;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	

}

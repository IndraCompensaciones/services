package co.com.sale.data;

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

	private String lastname;

	private String userPassword;

	private String eamil;

	private String userLogin;
	
	public UserLibraryData() {
		
	}
	
	public UserLibraryData(Long idUser, String nameUser, String lastname, String userPassword, String eamil, String userLogin) {
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.lastname = lastname;
		this.userPassword = userPassword;
		this.eamil = eamil;
		this.userLogin = userLogin;
	}

	public String getNameUser() {
		return nameUser;
	}

	public String getLastname() {
		return lastname;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getEamil() {
		return eamil;
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

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	
}

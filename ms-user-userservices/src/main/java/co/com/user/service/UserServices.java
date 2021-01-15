package co.com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.user.data.UserLibraryData;
import co.com.user.model.UserLibrary;
import co.com.user.repository.UserRepository;

/**
 * servicio que consulta la informacion del usuario
 * @author Administrador
 *
 */
@Service
@Transactional
public class UserServices {

	@Autowired
	UserRepository reposi;

	/**
	 * metodo que permite almacenar un usario
	 * 
	 * @param user
	 * @return
	 */
	public UserLibrary save(UserLibrary user) {
		return reposi.save(user);
	}

	/**
	 * metodo que permite consultar usuario por el usuario de login
	 * 
	 * @param UserLogin
	 * @return
	 */
	public UserLibraryData getUser(String userLogin, String userPassword) {
		UserLibrary user = reposi.findByUserLoginAndUserPassword(userLogin, userPassword);

	
		UserLibraryData userData = new UserLibraryData(user.getIdUser(), 
				user.getNameUser(),
				user.getLastname(),
				"*****", 
				user.getEmail(),
				user.getUserLogin());
		return userData;
	}

	

}

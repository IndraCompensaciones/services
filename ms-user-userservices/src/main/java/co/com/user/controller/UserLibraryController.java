package co.com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.user.data.Login;
import co.com.user.data.UserLibraryData;
import co.com.user.service.UserServices;

/**
 * clase que implementa el @RestController para la utenticacion del usuario
 * 
 * @author Administrador
 *
 */
@RestController
@RequestMapping("/auth/user")
public class UserLibraryController {

	/**
	 * service que consulta el usuario
	 */
	@Autowired
	UserServices service;

	/**
	 * metodo que consulta usuario por usuario y contraseña
	 * 
	 * @param login
	 * @return
	 */
	@CrossOrigin
	@PostMapping("/login")
	public UserLibraryData getUser(@RequestBody Login login) {
		return service.getUser(login.getUser(), login.getPassword());

	}

}

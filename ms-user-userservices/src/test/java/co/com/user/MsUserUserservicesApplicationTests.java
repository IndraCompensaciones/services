package co.com.user;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.user.model.UserLibrary;
import co.com.user.service.UserServices;

@SpringBootTest
class MsUserUserservicesApplicationTests {
	@Autowired
	UserServices service;


	@Test
	public void crearUsuarioRepo() {
		UserLibrary user = new UserLibrary();
		user.setIdUser(11L);
		user.setNameUser("tona");
		user.setLastname("villanueva");
		user.setEmail("tona@gmail.com");
		user.setUserLogin("tona");
		user.setUserPassword("123");
		UserLibrary userPersis = service.save(user);
		assertTrue(user.getUserPassword().equalsIgnoreCase(userPersis.getUserPassword()));
	}

}

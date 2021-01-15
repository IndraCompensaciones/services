package co.com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.user.model.*;

@Repository
public interface UserRepository extends JpaRepository<UserLibrary, Long> {
	UserLibrary findByUserLoginAndUserPassword(String userLogin, String userPassword);
}

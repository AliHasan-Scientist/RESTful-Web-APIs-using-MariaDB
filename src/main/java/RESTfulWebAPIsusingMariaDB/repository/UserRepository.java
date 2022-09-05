package RESTfulWebAPIsusingMariaDB.repository;

import RESTfulWebAPIsusingMariaDB.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsernameAndEmail(String username,String email);
}
package RESTfulWebAPIsusingMariaDB.service;

import RESTfulWebAPIsusingMariaDB.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    // Create a new User
    User creatUser(User user);

    // Get All Users
    List<User> getUsers();

    Optional<User> getUser(Long id);

    // update the User
    User updateUser(User user,Long id);
    // delete the User
    Void deleteUser(Long id);
}

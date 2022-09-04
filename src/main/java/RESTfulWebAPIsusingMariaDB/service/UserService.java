package RESTfulWebAPIsusingMariaDB.service;

import RESTfulWebAPIsusingMariaDB.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    // Create a new User
    User creatUser(User user);
    // Get All Users
    List<User> getUsers();
}

package RESTfulWebAPIsusingMariaDB.service.impl;

import RESTfulWebAPIsusingMariaDB.entity.User;
import RESTfulWebAPIsusingMariaDB.repository.UserRepository;
import RESTfulWebAPIsusingMariaDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    // Repo
    @Autowired
    private UserRepository userRepository;

    @Override
    public User creatUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }
}

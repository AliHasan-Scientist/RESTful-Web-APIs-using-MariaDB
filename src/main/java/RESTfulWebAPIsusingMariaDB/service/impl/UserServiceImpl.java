package RESTfulWebAPIsusingMariaDB.service.impl;

import RESTfulWebAPIsusingMariaDB.entity.User;
import RESTfulWebAPIsusingMariaDB.exceptions.ResourceNotFoundException;
import RESTfulWebAPIsusingMariaDB.repository.UserRepository;
import RESTfulWebAPIsusingMariaDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    // Repo
    @Autowired
    private UserRepository userRepository;

    @Override
    public User creatUser(User user) {
        User alreadyExit = this.userRepository.findUserByUsernameAndEmail(user.getUsername(),user.getEmail());
        if (alreadyExit == null) {
            return userRepository.save(user);

        } else
            return null;
    }

    @Override
    public List<User> getUsers() {

        List<User> users = userRepository.findAll();
        return users;

    }

    @Override
    public Optional<User> getUser(Long id) {

        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("User", "Id", id);
        } else
            return user;
    }

    @Override
    public User updateUser(User user, Long id) {

        User userData = userRepository.findById(id).orElseThrow();
        userData.setUsername(user.getUsername());
        userData.setEmail(user.getEmail());
        User saved = userRepository.save(userData);
        return saved;
    }

    @Override
    public Void deleteUser(Long id) {
        this.userRepository.deleteById(id);
        return null;
    }

}
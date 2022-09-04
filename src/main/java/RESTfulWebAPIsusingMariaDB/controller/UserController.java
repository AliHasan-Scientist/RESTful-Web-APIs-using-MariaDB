package RESTfulWebAPIsusingMariaDB.controller;

import RESTfulWebAPIsusingMariaDB.entity.User;
import RESTfulWebAPIsusingMariaDB.global.URI;
import RESTfulWebAPIsusingMariaDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(URI.initial)
public class UserController {
    // Service
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = this.userService.creatUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // get All Users
    @GetMapping("/user")
    public ResponseEntity<List<User>> Users() {
        List<User> users = this.userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

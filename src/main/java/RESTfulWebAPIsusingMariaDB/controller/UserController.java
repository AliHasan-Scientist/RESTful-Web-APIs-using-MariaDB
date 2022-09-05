package RESTfulWebAPIsusingMariaDB.controller;

import RESTfulWebAPIsusingMariaDB.entity.User;
import RESTfulWebAPIsusingMariaDB.global.URI;
import RESTfulWebAPIsusingMariaDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(URI.initial)
public class UserController {
    // Service
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        User savedUser = this.userService.creatUser(user);
        if (savedUser == null) {
            return ResponseEntity.badRequest().body("User already exists");

        }
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // get All Users
    @GetMapping("/user")
    public ResponseEntity<List<User>> Users() {
        List<User> users = this.userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // get Single User
    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<User>> User(@PathVariable(value = "id") Long id) {
        Optional<User> user = this.userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/user/{id}")

    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("id") Long id) {

        User updateUser = this.userService.updateUser(user, id);

        return ResponseEntity.ok().body(updateUser);
    }

    @DeleteMapping("/user/{id}")

    public ResponseEntity<?> updateUser(@PathVariable("id") Long id) {

        this.userService.deleteUser(id);

        return ResponseEntity.ok().body("User deleted Successfully");
    }
}

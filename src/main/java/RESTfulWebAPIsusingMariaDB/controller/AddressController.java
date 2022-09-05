package RESTfulWebAPIsusingMariaDB.controller;

import RESTfulWebAPIsusingMariaDB.entity.Address;
import RESTfulWebAPIsusingMariaDB.global.URI;
import RESTfulWebAPIsusingMariaDB.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping(URI.initial)
public class AddressController {
    // Service
    @Autowired
    private AddressService addressService;

    @PostMapping("/address")
    public ResponseEntity<?> createUser(@RequestBody Address address) {
        Address savedAddress = this.addressService.createAddress(address);
        return new ResponseEntity<>(savedAddress, HttpStatus.CREATED);
    }

    // get All Users
    @GetMapping("/address")
    public ResponseEntity<List<Address>> Users() {
        List<Address> addresses = this.addressService.getAddresses();
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }

//    // get Single User
//    @GetMapping("/user/{id}")
//    public ResponseEntity<Optional<User>> User(@PathVariable(value = "id") Long id) {
//        Optional<User> user = this.userService.getUser(id);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//
//    @PutMapping("/user/{id}")
//
//    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("id") Long id) {
//
//        User updateUser = this.userService.updateUser(user, id);
//
//        return ResponseEntity.ok().body(updateUser);
//    }
//
//    @DeleteMapping("/user/{id}")
//
//    public ResponseEntity<?> updateUser(@PathVariable("id") Long id) {
//
//        this.userService.deleteUser(id);
//
//        return ResponseEntity.ok().body("User deleted Successfully");
//    }
}

package RESTfulWebAPIsusingMariaDB.service;

import RESTfulWebAPIsusingMariaDB.entity.Address;
import RESTfulWebAPIsusingMariaDB.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {
    Address createAddress(Address address);

    // Get All Addresses
    List<Address> getAddresses();

    Optional<User> getAddress(Long id);

    // update the User
    Address updateAddress(Address address, Long id);

    // delete the User
    Void deleteAddress(Long id);

}

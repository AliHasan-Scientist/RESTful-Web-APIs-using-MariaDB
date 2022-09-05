package RESTfulWebAPIsusingMariaDB.service.impl;

import RESTfulWebAPIsusingMariaDB.entity.Address;
import RESTfulWebAPIsusingMariaDB.entity.User;
import RESTfulWebAPIsusingMariaDB.repository.AddressRepository;
import RESTfulWebAPIsusingMariaDB.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) {
        return this.addressRepository.save(address);
    }

    @Override
    public List<Address> getAddresses() {
        return this.addressRepository.findAll();
    }

    @Override
    public Optional<User> getAddress(Long id) {
        return Optional.empty();
    }

    @Override
    public Address updateAddress(Address address, Long id) {
        return null;
    }

    @Override
    public Void deleteAddress(Long id) {
        return null;
    }
}

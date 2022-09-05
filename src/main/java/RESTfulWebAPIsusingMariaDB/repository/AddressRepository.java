package RESTfulWebAPIsusingMariaDB.repository;

import RESTfulWebAPIsusingMariaDB.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
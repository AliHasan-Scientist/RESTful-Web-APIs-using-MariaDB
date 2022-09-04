package RESTfulWebAPIsusingMariaDB.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private String username;
    private String email;
    private Date dateOfBirth;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
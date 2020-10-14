package pl.onlinePetStore.Online.pet.Store.project.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * User class for login panel, registration, privileges
 */

/*
* Dodac:
* FB login, google login
* przywileje [user, cashier, admin]
*/

@Entity
@Getter
@Setter
public class User {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String mail;
    private String password;
    private String privileges;

    // Constructors
    public User() {
    }

    public User(long id, String username, String mail, String password, String privileges) {
        this.id = id;
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.privileges = privileges;
    }
}
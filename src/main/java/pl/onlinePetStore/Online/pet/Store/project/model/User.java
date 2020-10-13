package pl.onlinePetStore.Online.pet.Store.project.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*Dodac FB login
google login
przywileje [user, admin, moderator]*/

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String mail;
    private String password;
    private String permissions;
}
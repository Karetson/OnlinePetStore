package pl.onlinePetStore.Online.pet.Store.project.model.accessories;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * SuperClass for Accessories object
 */

@Entity
@Getter
@Setter
public class Accessories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String pet_type;
    private String description;
    private double price;

    /*
     * Constructors
     */
    public Accessories() {
    }

    public Accessories(long id, String name, String pet_type, String description, double price) {
        this.id = id;
        this.name = name;
        this.pet_type = pet_type;
        this.description = description;
        this.price = price;
    }
}

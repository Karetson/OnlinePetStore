package pl.onlinestore.pet.domain.accessory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Laser - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("7")
public class Laser extends Accessory {
    // Fields
    private String color;

    // Constructors
    public Laser() {
    }

    public Laser(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Laser(long id, String name, String pet_type, String image, String description, double price, String color) {
        super(id, name, pet_type, image, description, price);
        this.color = color;
    }
}

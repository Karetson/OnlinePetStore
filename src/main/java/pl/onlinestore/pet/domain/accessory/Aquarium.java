package pl.onlinestore.pet.domain.accessory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Aquarium - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("1")
public class Aquarium extends Accessory {
    // Fields
    private String dimensions;
    private int volume;

    // Constructors
    public Aquarium() {
    }

    public Aquarium(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Aquarium(long id, String name, String pet_type, String image, String description, double price, String dimensions, int volume) {
        super(id, name, pet_type, image, description, price);
        this.dimensions = dimensions;
        this.volume = volume;
    }
}

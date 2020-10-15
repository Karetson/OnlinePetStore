package pl.onlinestore.pet.domain.accessory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Grit - one of accessory item
 */
@Entity
@DiscriminatorValue("6")
public class Grit extends Accessory {
    // Constructors
    public Grit() {
    }

    public Grit(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }
}

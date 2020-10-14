package pl.onlinePetStore.Online.pet.Store.project.model.accessories;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Cage - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("3")
public class Cage extends Accessory {
    // Fields
    private String dimensions;

    // Constructors
    public Cage() {
    }

    public Cage(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Cage(long id, String name, String pet_type, String image, String description, double price, String dimensions) {
        super(id, name, pet_type, image, description, price);
        this.dimensions = dimensions;
    }
}

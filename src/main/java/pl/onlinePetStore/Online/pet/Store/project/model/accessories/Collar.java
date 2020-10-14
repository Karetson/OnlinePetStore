package pl.onlinePetStore.Online.pet.Store.project.model.accessories;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Muzzle - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("4")
public class Collar extends Accessory {
    // Fields
    private String color;
    private double size;

    // Constructors
    public Collar() {
    }

    public Collar(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Collar(long id, String name, String pet_type, String image, String description, double price, String color, double size) {
        super(id, name, pet_type, image, description, price);
        this.color = color;
        this.size = size;
    }
}

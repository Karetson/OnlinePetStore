package pl.onlinePetStore.Online.pet.Store.project.model.accessories;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Foder - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("5")
public class Fodder extends Accessory {
    // Fields
    private boolean fodder_type;    // dry[F] or wet[T]

    // Constructors
    public Fodder() {
    }

    public Fodder(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Fodder(long id, String name, String pet_type, String image, String description, double price, boolean fodder_type) {
        super(id, name, pet_type, image, description, price);
        this.fodder_type = fodder_type;
    }
}

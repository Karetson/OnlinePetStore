package pl.onlinestore.pet.domain.accessory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Ball - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("2")
public class Ball extends Accessory {
    // Fields
    private double size;

    // Constructors
    public Ball() {
    }

    public Ball(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Ball(long id, String name, String pet_type, String image, String description, double price, double size) {
        super(id, name, pet_type, image, description, price);
        this.size = size;
    }
}

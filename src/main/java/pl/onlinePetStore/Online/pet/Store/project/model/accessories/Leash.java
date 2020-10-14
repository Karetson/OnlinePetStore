package pl.onlinePetStore.Online.pet.Store.project.model.accessories;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.awt.*;

/*
 * Lead - one of accessory item
 */
@Entity
@Setter
@Getter
@DiscriminatorValue("8")
public class Leash extends Accessory {
    // Fields
    private double length;
    private String color;
    private String material;

    // Constructors
    public Leash() {
    }

    public Leash(long id, String name, String pet_type, String image, String description, double price) {
        super(id, name, pet_type, image, description, price);
    }

    public Leash(long id, String name, String pet_type, String image, String description, double price, double length, String color, String material) {
        super(id, name, pet_type, image, description, price);
        this.length = length;
        this.color = color;
        this.material = material;
    }
}

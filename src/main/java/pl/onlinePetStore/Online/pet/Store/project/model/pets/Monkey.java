package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Monkey - one of Pet object
 */
@Entity
@DiscriminatorValue("Małpka")
public class Monkey extends Pet {
    // Constructors
    public Monkey() {
    }

    public Monkey(Long id, String name, boolean gender, String description, String image, Double price) {
        super(id, name, gender, description, image, price);
    }
}


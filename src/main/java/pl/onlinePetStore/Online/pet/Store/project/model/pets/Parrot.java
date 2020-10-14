package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Parrot - one of Pet object
 */
@Entity
@DiscriminatorValue("Papuga")
public class Parrot extends Pet {
    // Constructors
    public Parrot() {
    }

    public Parrot(Long id, String name, boolean gender, String breed, String description, String image, Double price) {
        super(id, name, gender, breed, description, image, price);
    }
}


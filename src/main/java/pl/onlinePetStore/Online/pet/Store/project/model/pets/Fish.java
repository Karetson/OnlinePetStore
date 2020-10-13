package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Rybka")
public class Fish extends Pet {
    /*
     * Constructors
     */
    public Fish() {
    }

    public Fish(Long id, String name, boolean gender, String breed, String description, String image, Double price) {
        super(id, name, gender, breed, description, image, price);
    }
}


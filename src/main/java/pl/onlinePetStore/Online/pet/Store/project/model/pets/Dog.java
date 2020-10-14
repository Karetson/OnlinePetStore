package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Dog - one of Pet object
 */
@Entity
@DiscriminatorValue("Pies")
public class Dog extends Pet {
    // Constructors
    public Dog() {
    }

    public Dog(Long id, String name, boolean gender, String breed, String description, String image, Double price) {
        super(id, name, gender, breed, description, image, price);
    }
}


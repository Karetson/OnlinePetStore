package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Cat - one of Pet object
 */
@Entity
@DiscriminatorValue("Kot")
public class Cat extends Pet {
    // Fields

    // Constructors
    public Cat() {
    }

    public Cat(Long id, String name, boolean gender, String breed, String description, String image, Double price) {
        super(id, name, gender, breed, description, image, price);
    }
}
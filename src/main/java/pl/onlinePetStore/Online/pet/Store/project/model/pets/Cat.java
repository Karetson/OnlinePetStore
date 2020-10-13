package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
* Model class for Cat object
* 13.10.2020
 */

@Entity
@DiscriminatorValue("Kot")
public class Cat extends Pet {
    /*
     * Constructors
     */
    public Cat() {
    }

    public Cat(Long id, String name, boolean gender, String breed, String description, String image, Double price) {
        super(id, name, gender, breed, description, image, price);
    }
}


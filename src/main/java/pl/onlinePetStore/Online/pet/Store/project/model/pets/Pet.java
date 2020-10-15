package pl.onlinePetStore.Online.pet.Store.project.model.pets;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/*
 * SuperClass for pet object
 */

@Entity(name = "pets")
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pet_type", discriminatorType = DiscriminatorType.STRING) // creating new column with @DiscriminatorValue in entities which extending pet
public class Pet {
     // Fields
     // add field age
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // auto incrementation field "id"
    private Long id;
    private String name;
    private boolean gender;
    private String breed;
    private String description;
    private String image;
    private Double price;

     // Constructors
    public Pet() {
    }

    public Pet(Long id, String name, boolean gender, String breed, String description, String image, Double price) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.description = description;
        this.image = image;
        this.price = price;
    }
}
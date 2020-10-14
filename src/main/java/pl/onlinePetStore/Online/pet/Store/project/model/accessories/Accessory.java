package pl.onlinePetStore.Online.pet.Store.project.model.accessories;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
 * SuperClass for Accessories object
 */

@Entity(name = "accessories")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "accessory_type", discriminatorType = DiscriminatorType.INTEGER)
public class Accessory {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String pet_type;
    private String image;
    private String description;
    private double price;

    // Constructors
    public Accessory() {
    }

    public Accessory(long id, String name, String pet_type, String image, String description, double price) {
        this.id = id;
        this.name = name;
        this.pet_type = pet_type;
        this.image = image;
        this.description = description;
        this.price = price;
    }
}

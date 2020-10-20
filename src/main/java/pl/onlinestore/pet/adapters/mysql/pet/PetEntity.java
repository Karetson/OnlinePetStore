package pl.onlinestore.pet.adapters.mysql.pet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.onlinestore.pet.domain.pet.Pet;

import javax.persistence.*;
import java.math.BigDecimal;

/*
 * SuperClass for pet object
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "pets")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pet_type", discriminatorType = DiscriminatorType.STRING) // creating new column with @DiscriminatorValue in entities which extending pet
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean gender;
    private String breed;
    private String description;
    private String image;
    private BigDecimal price;

    public Pet asPet() {
        return new Pet(
                id,
                name,
                gender,
                breed,
                description,
                image,
                price
        );
    }
}
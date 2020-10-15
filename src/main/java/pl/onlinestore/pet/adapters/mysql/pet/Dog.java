package pl.onlinestore.pet.adapters.mysql.pet;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

/*
 * Dog - one of Pet object
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("dog")
@Data
@NoArgsConstructor
public class Dog extends PetEntity {
    public Dog(Long id, String name, boolean gender, String breed, String description, String image, BigDecimal price) {
        super(id, name, gender, breed, description, image, price);
    }
}


package pl.onlinestore.pet.adapters.mysql.pet;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
/*
 * Monkey - one of Pet object
 */

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("monkey")
@Data
@NoArgsConstructor
public class Monkey extends PetEntity {
    public Monkey(Long id, String name, boolean gender, String breed, String description, String image, BigDecimal price) {
        super(id, name, gender, breed, description, image, price);
    }
}


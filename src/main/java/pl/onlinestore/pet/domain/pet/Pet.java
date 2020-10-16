package pl.onlinestore.pet.domain.pet;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Pet {
    Long id;
    String name;
    boolean gender;
    String breed;
    String description;
    String image;
    BigDecimal price;
}

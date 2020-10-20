package pl.onlinestore.pet.domain.accessory;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Accessory {
    Long id;
    String name;
    String petType;
    String image;
    String description;
    BigDecimal price;
}

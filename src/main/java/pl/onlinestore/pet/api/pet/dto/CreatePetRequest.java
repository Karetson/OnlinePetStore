package pl.onlinestore.pet.api.pet.dto;

import lombok.Value;
import pl.onlinestore.pet.adapters.mysql.pet.PetEntity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Value
public class CreatePetRequest {
    @NotEmpty
    String name;
    boolean gender;
    @NotEmpty
    String breed;
    String description;
    String image;
    @NotNull
    BigDecimal price;

    public PetEntity asPet() {
        return new PetEntity(
                null,
                name,
                gender,
                breed,
                description,
                image,
                price
        );
    }

    public PetEntity asPet(Long id) {
        return new PetEntity(
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

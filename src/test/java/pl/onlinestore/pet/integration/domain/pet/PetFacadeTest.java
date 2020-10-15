package pl.onlinestore.pet.integration.domain.pet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.onlinestore.pet.adapters.mysql.pet.PetEntity;
import pl.onlinestore.pet.api.pet.dto.CreatePetRequest;
import pl.onlinestore.pet.domain.pet.Pet;
import pl.onlinestore.pet.domain.pet.PetFacade;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PetFacadeTest {

    @Autowired
    private PetFacade petFacade;

    @Test
    void shouldLoadNoPets() {
        //when
        List<Pet> allPets = petFacade.getPets();
        //then
        assertTrue(allPets::isEmpty);
    }

    @Test
    void shouldLoadOnePetAfterInsertingOneToDb() {
        //given
        CreatePetRequest pet = new CreatePetRequest("name", true, "pet", "test", "test", new BigDecimal("123.45"));
        petFacade.addPet(pet);
        //when
        List<Pet> allPets = petFacade.getPets();
        //then
        assertNotNull(allPets.get(0));
    }
}

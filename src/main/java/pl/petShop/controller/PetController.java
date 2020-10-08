package pl.petShop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.petShop.model.Pet;
import pl.petShop.service.PetService;

@RestController
@RequiredArgsConstructor
public class PetController {
    private final PetService petService;

    @PostMapping("/pets")
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }
}

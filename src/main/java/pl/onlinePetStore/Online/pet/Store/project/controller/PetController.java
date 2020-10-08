package pl.onlinePetStore.Online.pet.Store.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.onlinePetStore.Online.pet.Store.project.model.Pet;
import pl.onlinePetStore.Online.pet.Store.project.service.PetService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController {
    private final PetService petService;

    @PostMapping("/pets")
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }

    @PutMapping("/pets")
    public Pet editPet(@RequestBody Pet pet) {
        return petService.editPet(pet);
    }

    @DeleteMapping("/pets/{id}")
    public void deletePet(@PathVariable long id) {
        petService.deletePet(id);
    }

    @GetMapping("/pets/{id}")
    public Pet getSinglePet(@PathVariable long id) {
        return petService.getSinglePet(id);
    }

    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }
}

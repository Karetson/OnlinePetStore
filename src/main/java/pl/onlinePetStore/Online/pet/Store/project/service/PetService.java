package pl.onlinePetStore.Online.pet.Store.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.onlinePetStore.Online.pet.Store.project.model.pets.Pet;
import pl.onlinePetStore.Online.pet.Store.project.repository.PetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet editPet(Long id, Pet pet) {
        Pet editedPet = petRepository.findById(id).orElseThrow();
        editedPet.setName(pet.getName());
        editedPet.setBreed(pet.getBreed());
        editedPet.setDescription(pet.getDescription());
        editedPet.setPrice(pet.getPrice());

        return petRepository.save(editedPet);
    }

    public void deletePet(long id) {
        petRepository.deleteById(id);
    }

    public Pet getSinglePet(long id) {
        return petRepository.findById(id).orElseThrow();
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }


}

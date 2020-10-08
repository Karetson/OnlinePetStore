package pl.petShop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.petShop.model.Pet;
import pl.petShop.repository.PetRepository;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }
}

package pl.onlinePetStore.Online.pet.Store.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.onlinePetStore.Online.pet.Store.project.model.pets.Pet;

//add findByPrice with sort

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    void findByBreed (String breed);
    void findByName (String name);
}

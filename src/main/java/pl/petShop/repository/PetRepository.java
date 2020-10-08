package pl.petShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.petShop.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}

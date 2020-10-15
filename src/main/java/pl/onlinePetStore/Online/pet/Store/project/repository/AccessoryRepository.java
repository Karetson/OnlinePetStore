package pl.onlinePetStore.Online.pet.Store.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.onlinePetStore.Online.pet.Store.project.model.accessories.Accessory;

/*
 * AccessoryRepository for Accessory object with CRUD
 * Initialized nonstanard methods
 */

//add findByPrice with sort
@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
    // Nonstandards methods

}

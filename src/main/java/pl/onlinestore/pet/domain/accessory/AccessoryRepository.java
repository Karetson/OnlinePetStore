package pl.onlinestore.pet.domain.accessory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * AccessoryRepository for Accessory object with CRUD
 * Initialized nonstanard methods
 */

//add findByPrice with sort
@Repository
public interface AccessoryRepository extends JpaRepository<Accessory, Long> {
    // Nonstandards methods

}

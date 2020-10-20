package pl.onlinestore.pet.domain.accessory;

import pl.onlinestore.pet.adapters.mysql.accessories.AccessoryEntity;

import java.util.List;
import java.util.Optional;

public interface AccessoryRepository {
    void findByName(String name);
    Optional<AccessoryEntity> findById(long id);
    List<AccessoryEntity> findAll();
    AccessoryEntity save(AccessoryEntity accessoryEntity);
    void deleteById(long id);
}

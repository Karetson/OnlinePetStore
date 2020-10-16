package pl.onlinestore.pet.domain.accessory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.onlinestore.pet.domain.accessory.Accessory;
import pl.onlinestore.pet.domain.accessory.AccessoryRepository;

import java.util.List;

/*
 * Service class for Pet object
 * Initialized methods for Pet object with CRUD in PetController
 */
@Service
@RequiredArgsConstructor
public class AccessoryService {
    private final AccessoryRepository accessoryRepository;

    // Methods for Controller from Repository
    public Accessory addAccessory(Accessory accessory) {
        return accessoryRepository.save(accessory);
    }

    public Accessory editAccessory(long id, Accessory accessory) {
        Accessory editedAccessory = accessoryRepository.findById(id).orElseThrow();
        editedAccessory.setName(accessory.getName());
        editedAccessory.setDescription(accessory.getDescription());
        editedAccessory.setImage(accessory.getImage());
        editedAccessory.setPrice(accessory.getPrice());
        editedAccessory.setPetType(accessory.getPetType());
        return accessoryRepository.save(editedAccessory);
    }

    public void deleteAccessory(long id) {
        accessoryRepository.deleteById(id);
    }

    public Accessory getSingleAccessory(long id) {
        return accessoryRepository.findById(id).orElseThrow();
    }

    public List<Accessory> getAllAccessories() {
        return accessoryRepository.findAll();
    }
}

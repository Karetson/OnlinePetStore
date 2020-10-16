package pl.onlinestore.pet.api.accessory;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.onlinestore.pet.domain.accessory.Accessory;
import pl.onlinestore.pet.domain.accessory.AccessoryService;

import java.util.List;

/*
 * Controller for Accessories
 * Initialized methods for CRUD
 */
@RestController
@RequiredArgsConstructor
public class AccessoriesController {
    private final AccessoryService accessoryService;

    @PostMapping("/accessories")
    public Accessory addAccessory(@RequestBody Accessory accessory) {
        return accessoryService.addAccessory(accessory);
    }

    @PutMapping("/accessories/{id}")
    public Accessory editAccessory(@PathVariable long id,@RequestBody Accessory accessory) {
        return accessoryService.editAccessory(id, accessory);
    }

    @DeleteMapping("/accessories/{id}")
    public void deleteAccessory(@PathVariable long id) {
        accessoryService.deleteAccessory(id);
    }

    @GetMapping("/accessories/{id}")
    public Accessory getSingleAccessory(@PathVariable long id) {
        return accessoryService.getSingleAccessory(id);
    }

    @GetMapping("/accessories")
    public List<Accessory> getAllAccessories() {
        return accessoryService.getAllAccessories();
    }
}

package pl.onlinePetStore.Online.pet.Store.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.onlinePetStore.Online.pet.Store.project.model.accessories.Accessory;
import pl.onlinePetStore.Online.pet.Store.project.service.AccessoryService;

import java.util.List;

/*
 * Controller for Accessories
 * Initialized methods for CRUD
 */
@RestController
@RequiredArgsConstructor
public class AccessoriesController {
    // Fields
    private final AccessoryService accessoryService;

    // CRUD methods
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

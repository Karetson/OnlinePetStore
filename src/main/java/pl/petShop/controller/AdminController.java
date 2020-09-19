package pl.petShop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.petShop.model.Animal;

@RestController
@RequiredArgsConstructor
public class AdminController {
    @PostMapping("/admin")
    public void adminLogin() {

    }

    @PostMapping("/admin/")
    public Animal addAnimal(@RequestBody Animal animal) {
        return null;
    }
}

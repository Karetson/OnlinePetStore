package pl.onlinestore.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Main runner application for OnlinePetStore
 * Connection to MySQL Database
 * CRUD Pet object, Accessory object
 * Created: 01.10.2020
 */
@SpringBootApplication
public class OnlinePetStoreProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlinePetStoreProjectApplication.class, args);
	}
}
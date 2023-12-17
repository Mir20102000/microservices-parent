package com.radjapov.inventoryservice;

import com.radjapov.inventoryservice.repository.InventoryRepository;
import com.radjapov.inventoryservice.model.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("samsung_galaxy_s22");
			inventory.setQuantity(1);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("samsung_galaxy_s22_ultra");
			inventory.setQuantity(0);

			Inventory inventory2 = new Inventory();
			inventory.setSkuCode("test_2");
			inventory.setQuantity(5);

			Inventory inventory3 = new Inventory();
			inventory.setSkuCode("test_3");
			inventory.setQuantity(13);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
			inventoryRepository.save(inventory3);
		};
	}
}

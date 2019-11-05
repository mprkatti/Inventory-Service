package com.mpk.inventory.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	Logger logger = LoggerFactory.getLogger(InventoryController.class);

	@Autowired
	Environment env;

	@GetMapping("/status")
	public String status() {
		String appName = env.getProperty("application.alt.name");
		return appName + " up and runnig ...";
	}

	@PostMapping
	@RequestMapping("/{itemId}/{transactionType}")
	public ResponseEntity<?> updateInventory(@PathVariable String itemId, @PathVariable String transactionType) {

		logger.info("Received item:" + itemId + " for: " + transactionType);
		logger.info("Update Inventory Completed .....");
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}

package com.sarsvp.customer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/customer")
public class CustomerController {

	@GetMapping("/test-swagger-config")
	public ResponseEntity<String> swaggerConfigTest() {
		return ResponseEntity.ok("Swagger configuration successful");
	}

}

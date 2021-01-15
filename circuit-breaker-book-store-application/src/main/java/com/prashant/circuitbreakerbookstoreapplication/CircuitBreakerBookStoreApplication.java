package com.prashant.circuitbreakerbookstoreapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CircuitBreakerBookStoreApplication {

	@RequestMapping(value = "/recommended")
	public String readingList() {
		return "Algorithms (Robert Sedgewick & Kevin Wayne), The Self-Taught Programmer (Cory Althoff), Rapid Development (Steve McConnell)";
	}

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerBookStoreApplication.class, args);
	}

}

package com.saad.aldawsari.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.saad"})
public class SimsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimsApplication.class, args);
	}

}

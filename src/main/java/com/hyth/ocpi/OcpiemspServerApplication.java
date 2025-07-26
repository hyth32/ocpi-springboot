package com.hyth.ocpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hyth.ocpi.infrastructure.repository")
@EntityScan(basePackages = "com.hyth.ocpi.domain.model")
public class OcpiemspServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcpiemspServerApplication.class, args);
	}

}

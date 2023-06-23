package br.com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = "br.com.application.model")
@SpringBootApplication
public class RedApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedApplication.class, args);
	}

}

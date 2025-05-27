package com.luizbarros.domain_model_orm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainModelOrmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DomainModelOrmApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application ON!");
	}

}

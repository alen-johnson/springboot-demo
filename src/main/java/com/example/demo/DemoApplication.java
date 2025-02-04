package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("MONGO_URI", dotenv.get("MONGO_URI"));
		System.setProperty("MONGO_DB", dotenv.get("MONGO_DB"));

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("demo start");
	}

}

package io.shivamvk.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RestApiApp {
	public static void main(String[] args) {
		SpringApplication.run(RestApiApp.class, args);
	}
}

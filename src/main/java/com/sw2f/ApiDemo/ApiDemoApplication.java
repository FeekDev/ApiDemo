package com.sw2f.ApiDemo;

import org.aspectj.apache.bcel.classfile.Module.Open;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class ApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

	// Documentacion
	@Bean // para que se 
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API Demo")
						.version("1.0.0")
						.description("Documentacion de la API Demo")
						);
	}
}

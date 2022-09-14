package com.example.artcodezen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MeuProjetoRestApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(MeuProjetoRestApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder
		configure(SpringApplicationBuilder application) {
		return application.sources(MeuProjetoRestApplication.class);
	}
	
}




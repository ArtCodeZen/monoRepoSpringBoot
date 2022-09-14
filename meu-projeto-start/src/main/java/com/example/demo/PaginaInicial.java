package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/show")
public class PaginaInicial {
	// Acessando /show
	@GetMapping
	public String show() {
		return "<h1>Olá Show de bola!</h1>";
	}
	// Para acessar /show/bemvindo
	@GetMapping(value = "/bemvindo")
	public String home() {
		return "<h1>Olá seja bem vindo!</h1>";
	}
	
	// Acessando /show/filter?q=valorqualquer
	@GetMapping("/filter")
	public String myFilter(@RequestParam("q") String filter) {
		return "<h1>Parâmetro inserido valor: " + filter + "</h1>";
	}
}

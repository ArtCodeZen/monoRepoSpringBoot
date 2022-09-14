package com.example.artcodezen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.artcodezen.entities.Propriedade;
import com.example.artcodezen.repository.PropriedadeRepository;

@RestController
@RequestMapping("/api")
public class PropriedadeController {
	
	@Autowired
	private PropriedadeRepository repository;
	
	@GetMapping
	public String apiMessage() {
		return "Você acessou a raiz API insita /find?filtro = algumvalor!";
	}
	@GetMapping("/find")
	List<Propriedade> findByFiltro
	(@RequestParam("filtro") String filtro){
		System.out.println("Find");
		return repository.findByFiltro(filtro);
	}
}

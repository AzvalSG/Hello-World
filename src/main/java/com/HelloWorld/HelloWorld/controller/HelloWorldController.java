package com.HelloWorld.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}
@RequestMapping("/BSMs")
	@GetMapping
	public String BSMs() {
		return "« Mentalidade de Crescimento\r\n" + "« Persistencia\r\n" + "\r\n" + "* Responsabilidade Pessoal\r\n"
				+ "\r\n" + "* Orientação ao futuro\r\n" + "\r\n" + "* Comunicação\r\n" + "\r\n"
				+ "* Orientação ao Detalhe\r\n" + "\r\n" + "* Proatividade\r\n" + "\r\n" + "* Trabalho em equipe\r\n";
	}
@RequestMapping("/aprsemana")
	@GetMapping
	public String aprsemana() {
		return "Meu foco de desenvolvimento nessa semana é na BSM de"
				+ " Orientação aos detalhes pois sinto que acabo deixanto passar erros simples que evitariam dor de cabeça futuramente";
	}

}

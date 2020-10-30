package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/get1")
	public String hello1() {
		return "Persistência e Atenção aos detalhes";
	}
	
	@GetMapping("/get2")
	public String hello2() {
		return "Aprender a utilizar Spring Tool e MySQL";
	}

}

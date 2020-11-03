package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Ponto no endereço do site
@RequestMapping("/hello")
@RestController
public class ServicoController {
	
	//MVC - Estrutura de programação orientada à objeto -> Model View Controller
	//MVC -> model (tables)
	//MVC -> view (front)
	//MVC -> controller (cérebro, endereçamento)
	//JPA -> Interface
	
//	@GetMapping("/get1")
//	public String hello1() {
//		return "Persistência e Atenção aos detalhes";
//	}
//	
//	@GetMapping("/get2")
//	public String hello2() {
//		return "Aprender a utilizar Spring Tool e MySQL";
//	}
	
	//injeção
		@Autowired
		private ServicoRepository repository;
		
		@GetMapping ("/servicos")
		public List<ServicoModel> pegarTodos() {		
			return repository.findAll();
		}
		
		//Post é responsável por inserir
		@PostMapping("/servicos")
		public ServicoModel criar (@RequestBody ServicoModel tabelaServico) {
			repository.save(tabelaServico);
			return tabelaServico;
		}

}

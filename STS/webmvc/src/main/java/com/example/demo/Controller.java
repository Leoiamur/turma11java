package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@RequestMapping("/teste")
public class Controller implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}

	@Autowired //INJETA O REPOSITÓRIO
	private ManutencaoRepository repository;
	
	@Autowired
	private Services service;
	
	@GetMapping("/testes")
    public ResponseEntity<List<ManutencaoTable>> listAllItens() {
        List<ManutencaoTable> itens= service.findAllItens();
        if(itens.isEmpty()){
            return new ResponseEntity<List<ManutencaoTable>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<ManutencaoTable>>(itens, HttpStatus.ACCEPTED);
    }
	
	//QUATRO MÉTODOS --> GET, POST, PUT E DELETE
	//GET BY ID, GET BY NOME
	@GetMapping("/manutencoes")
	public List<ManutencaoTable> buscarTodos() {
		return repository.findAll();
	}
	
	@PostMapping("/manutencoes")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetoManutencao) {
		repository.save(objetoManutencao);
		return objetoManutencao;
	}
	
	//PATHVARIABLE SERVE PARA PEGAR O PARÂMETRO
	//deste jeito nao retornar erro
	@GetMapping("/manutencoes/id/{id}")
	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) {
		return repository.findById(id);
	}
		
//		@GetMapping("/manutencoes/id/{id}")
//		public ResponseEntity<ManutencaoTable> getById(@PathVariable long id){
//			return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
//					.orElse(ResponseEntity.notFound().build());
//		}

	
	//ATUALIZAR, PRIMEIRO PEGA COM O @PATHVARIABLE, DEPOIS INSERE COM O @REQUESTBODY
	@PutMapping("/manutencoes/{id}")
	public ManutencaoTable atualizar(@PathVariable Long id, @RequestBody ManutencaoTable model) {
		model.setId(id);
		repository.save(model);
		return model;
	}
	
	@GetMapping("/manutencoes/teste/{nome}")
	public List<ManutencaoTable> buscarPorNome(@PathVariable String nome){
		return repository.findByNome(nome);
	}
	
	@GetMapping("/manutencoes/{nome}/{categoria}")
	public Optional<ManutencaoTable> findByNomeAndCategoria(@PathVariable String nome, @PathVariable String categoria) {
		return repository.findByNomeAndCategoria(nome, categoria);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	

	
	//view = front
	//controller = Requests e getmapping
	//toda vez que você clicar na barra, será direcionado para o index
}

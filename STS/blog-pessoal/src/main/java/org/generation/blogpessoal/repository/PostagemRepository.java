package org.generation.blogpessoal.repository;

import java.util.List;

import org.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
	@Query(value = "select * from postagem where ano > 2011", nativeQuery = true)
	List<Postagem> findAllMaior();
	
	@Query(value = "select * from postagem order by ano desc", nativeQuery = true)
	List<Postagem> anosDesc();
	
	@Query(value = "select * from postagem order by ano asc", nativeQuery = true)
	List<Postagem> anosAsc();
	
	@Query(value = "select * from postagem where ano >= 2011 and ano <= 2013", nativeQuery = true)
	List<Postagem> anosIntervalo();
}

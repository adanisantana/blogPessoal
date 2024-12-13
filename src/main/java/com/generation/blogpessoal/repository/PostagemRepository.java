package com.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public Optional<Postagem> findByTitulo(String titulo);

	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}

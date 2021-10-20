package com.delta.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.restapi.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
	
	Cadastro findById(long id);
	
}

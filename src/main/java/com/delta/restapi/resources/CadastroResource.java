package com.delta.restapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.restapi.models.Cadastro;
import com.delta.restapi.repository.CadastroRepository;


@RestController

@RequestMapping(value="/api")
public class CadastroResource {
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@CrossOrigin(origins = "http://delta-front.vercel.app")
	@GetMapping("/cadastro/{id}")
	public Cadastro findOne(@PathVariable(value="id") long id){
		return cadastroRepository.findById(id);
	}
	
	@CrossOrigin(origins = "http://delta-front.vercel.app")
	@PostMapping("/cadastro")
	public Cadastro saveCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}
	
	@CrossOrigin(origins = "http://delta-front.vercel.app")
	@PutMapping("/cadastro/{id}")
	public Cadastro updateCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}
	

}

package com.ceub.primeiro_verso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ceub.primeiro_verso.domain.Categoria;
import com.ceub.primeiro_verso.repositories.CategoriaRepository;

@SpringBootApplication
public class PrimeiroVersoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroVersoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// objeto instanciado e vai para repositories para ser salvo no banco de dados
		Categoria cat1 = new Categoria(null, "Caneca");
		Categoria cat2 = new Categoria(null, "Camisa");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}

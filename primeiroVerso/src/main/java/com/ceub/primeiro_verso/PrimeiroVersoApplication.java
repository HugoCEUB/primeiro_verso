package com.ceub.primeiro_verso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ceub.primeiro_verso.domain.Categoria;
import com.ceub.primeiro_verso.domain.Produto;
import com.ceub.primeiro_verso.repositories.CategoriaRepository;
import com.ceub.primeiro_verso.repositories.ProdutoRepository;

@SpringBootApplication
public class PrimeiroVersoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroVersoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// objeto instanciado e vai para repositories para ser salvo no banco de dados
		Categoria cat1 = new Categoria(null, "Caneca");
		Categoria cat2 = new Categoria(null, "Camisa");
		
		Produto p1 = new Produto(null,"Computador", 2000.00);
		Produto p2 = new Produto(null,"Impressora", 800.00);
		Produto p3 = new Produto(null,"Mouse", 50.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
	}

}

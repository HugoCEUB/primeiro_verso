package com.ceub.primeiro_verso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.primeiro_verso.domain.Categoria;

// classe controlador Rest que responde pelo endpoint /categorias

@RestController 
@RequestMapping(value="/categorias")
public class CategoriaResource {
	// método básico
	// atribuir o métodos http de acordo com a requisição desejada (obter dados = get, salvar/incluir = post)
	// retorna lista de categorias
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		// 2 objetos 
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		// instaciados para testar
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}

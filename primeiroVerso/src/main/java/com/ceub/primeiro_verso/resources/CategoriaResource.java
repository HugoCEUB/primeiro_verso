package com.ceub.primeiro_verso.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.primeiro_verso.domain.Categoria;
import com.ceub.primeiro_verso.services.CategoriaService;

// classe controlador Rest que responde pelo endpoint /categorias

@RestController 
@RequestMapping(value="/categorias")
public class CategoriaResource {
	// método básico
	// atribuir o métodos http de acordo com a requisição desejada (obter dados = get, salvar/incluir = post)
	// retorna lista de categorias
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
		// 2 objetos 
		// Categoria cat1 = new Categoria(1, "Informática");
		// Categoria cat2 = new Categoria(2, "Escritório");
		
		// instaciados para testar
		// List<Categoria> lista = new ArrayList<>();
		// lista.add(cat1);
		// lista.add(cat2);
		
		// return lista;
	}
}

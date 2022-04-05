package com.ceub.primeiro_verso.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// classe controlador Rest que responde pelo endpoint /categorias

@RestController 
@RequestMapping(value="/categorias")
public class CategoriaResource {
	// método básico
	// atribuir o métodos http de acordo com a requisição desejada (obter dados = get, salvar/incluir = post)
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}

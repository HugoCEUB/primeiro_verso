package com.ceub.primeiro_verso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceub.primeiro_verso.domain.Pedido;
import com.ceub.primeiro_verso.repositories.PedidoRepository;
import com.ceub.primeiro_verso.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	// serviço que chama operação de obj de acesso a dados
	@Autowired
	private PedidoRepository repo;
	// Buscar categoria por código
	
	/*
	public Pedido find(Integer id) {
		// Para buscar um obj por ID se utiliza o método findById, retorna um obj Optional do tipo que eu <instanciei>
		// Optional Obj Container que carrega um Obj do tipo informado e encapsula a questão do Objeto estar instaciado ou não
		Optional<Pedido> obj = repo.findById(id);
		// Se obj encontrado return obje se não return null
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return obj.orElse(null);
	}
	*/
	public Pedido find(Integer id) {
	 	Optional<Pedido> obj = repo.findById(id);
	 	return obj.orElseThrow(() -> new ObjectNotFoundException(
	 			"Objeto nao encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	 
	 
	}
}

package com.ceub.primeiro_verso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceub.primeiro_verso.domain.Endereco;

// obj da camada de acesso a dados referente a categoria
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
	
}

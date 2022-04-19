package com.ceub.primeiro_verso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceub.primeiro_verso.domain.Cidade;

// obj da camada de acesso a dados referente a categoria
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
}

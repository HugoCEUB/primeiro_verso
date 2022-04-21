	/* 
	 * Checklista para criar entidades:
	 * - Atributos básicos!
	 * - Associações (inicie as coleções)
	 * - Construtures (não inclua coleções no contrutor com parâmetros)
	 * - Getters e setters
	 * - hashCode e equal (implementação padrão: somente id)
	 * - Serializable (padrão: 1L)
	*/
package com.ceub.primeiro_verso.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

// mapeamento da classe, Entity para ser classificado com uma entidade do JPA
@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// - Atributos básicos!
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // estrategia de geração automatica dos Id's das categorias
	private Integer id;
	private String nome;
	
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList<>();
	
	// - Construtures
	public Categoria() {
		
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	// - Getters e setters (métodos de acesso para os atributos
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	// - hashCode e equal (operação para comparar os objetos por valor e não por ponteiro na memoria)
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}


	
	// Serializable (converte os objetos da classe para uma sequencia de bits, para q os objetos possam ser gravados em arquivos, trafegar em rede, etc...)
}

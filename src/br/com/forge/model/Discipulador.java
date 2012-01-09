package br.com.forge.model;

import javax.persistence.Entity;

@Entity
public class Discipulador extends ForgeObject{

	private String nome;
	
	public void setNome(String nomeDiscipulador) {
		this.nome = nomeDiscipulador;
	}

	public String getNome() {
		return nome;
	}
}
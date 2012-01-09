package br.com.forge.model;

import javax.persistence.Entity;

@Entity
public class Discipulo extends ForgeObject {

	private String nome;
	
	public void setNome(String nomeDiscipulo) {
		this.nome = nomeDiscipulo;
	}

	public String getNome() {
		return nome;
	}
}
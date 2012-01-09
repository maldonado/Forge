package br.com.forge.model;

import javax.persistence.Entity;

@Entity
public class Anotacao extends ForgeObject {

	private String descricao;

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
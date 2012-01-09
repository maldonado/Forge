package br.com.forge.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.joda.time.DateMidnight;

public abstract class ForgeObject {
	
	@Id
	@GeneratedValue
	private Long id;

	private DateMidnight dataCriacao;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public DateMidnight getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(DateMidnight dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public boolean Equals(Object object){
		if(this == object){
			return true;
		}
		if(object instanceof ForgeObject){
			return this.id.equals(id);
		}
		return false;
	}
	
}
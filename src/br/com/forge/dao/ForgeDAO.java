package br.com.forge.dao;

import org.hibernate.Session;

import br.com.forge.model.ForgeObject;

public abstract class ForgeDAO <T extends ForgeObject>  {

	protected Session session;
	
	public void insert(T object){
		session.save(object);
	}
	
	public void update(T object){
		session.update(object);
	}
	
	public void delete(T object){
		session.delete(object);
	}
	
}
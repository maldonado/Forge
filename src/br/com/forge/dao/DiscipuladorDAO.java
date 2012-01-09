package br.com.forge.dao;

import org.hibernate.Session;

import br.com.forge.model.Discipulador;

public class DiscipuladorDAO extends ForgeDAO<Discipulador>{
	
	public DiscipuladorDAO(Session session){
		super.session = session;
	}
	
}
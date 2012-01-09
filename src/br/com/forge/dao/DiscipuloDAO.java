package br.com.forge.dao;

import org.hibernate.Session;

import br.com.forge.model.Discipulo;

public class DiscipuloDAO extends ForgeDAO<Discipulo> {
	
	public DiscipuloDAO(Session session) {
		super.session = session;
	}
}
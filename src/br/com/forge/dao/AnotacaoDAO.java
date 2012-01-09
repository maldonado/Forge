package br.com.forge.dao;

import org.hibernate.Session;

import br.com.forge.model.Anotacao;

public class AnotacaoDAO extends ForgeDAO<Anotacao> {

	public AnotacaoDAO(Session session) {
		super.session = session;
	}
}
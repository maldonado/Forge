package br.com.forge.dao;

import junit.framework.Assert;

import org.hibernate.Session;
import org.junit.Test;

import br.com.forge.dao.DiscipuloDAO;
import br.com.forge.dao.ForgeDAO;

public class DiscipuloDAOTest {

	private Session session;
	
	@Test
	public void testClassSuperClass(){
		Assert.assertTrue(new DiscipuloDAO(session) instanceof ForgeDAO<?>);
	}
}
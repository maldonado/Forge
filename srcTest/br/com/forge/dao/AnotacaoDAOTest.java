package br.com.forge.dao;

import junit.framework.Assert;

import org.hibernate.Session;
import org.junit.Test;

import br.com.forge.dao.AnotacaoDAO;
import br.com.forge.dao.ForgeDAO;

public class AnotacaoDAOTest {

	private Session session;
	
	@Test
	public void testClassSuperClass() throws Exception {
		Assert.assertTrue(new AnotacaoDAO(session) instanceof ForgeDAO<?>);
	}
}
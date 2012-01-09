package br.com.forge.dao;

import junit.framework.Assert;

import org.hibernate.Session;
import org.junit.Test;

import br.com.forge.dao.DiscipuladorDAO;
import br.com.forge.dao.ForgeDAO;

public class DiscipuladorDAOTest {
	
	private Session session;
	
	@Test
	public void testClassSuperClass(){
		Assert.assertTrue(new DiscipuladorDAO(session) instanceof ForgeDAO<?>);
	}

}
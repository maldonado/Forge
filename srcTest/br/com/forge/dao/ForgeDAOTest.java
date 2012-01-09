package br.com.forge.dao;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.hibernate.Session;
import org.junit.Test;

import br.com.forge.dao.ForgeDAO;
import br.com.forge.model.Discipulador;
import br.com.forge.model.ForgeObject;

public class ForgeDAOTest {
	
	private Session sessionMock;
	
	@Test
	public void testInsert(){
		sessionMock = mock(Session.class);
		ForTest classForTest = new ForTest();
		classForTest.insert(new Discipulador());
		verify(sessionMock).save(any(ForgeObject.class));
	}
	
	@Test
	public void testUpdate(){
		sessionMock = mock(Session.class);
		ForTest classForTest = new ForTest();
		classForTest.update(new Discipulador());
		verify(sessionMock).update(any(ForgeObject.class));
	}
	
	@Test
	public void testDelete() throws Exception {
		sessionMock = mock(Session.class);
		ForTest classForTest = new ForTest();
		classForTest.delete(new Discipulador());
		verify(sessionMock).delete(any(ForgeObject.class));
	}
	
	private class ForTest extends ForgeDAO<Discipulador>{
		
		{
			super.session = sessionMock;
		}
	}
}
package br.com.forge.model;

import javax.persistence.Entity;

import junit.framework.Assert;

import org.junit.Test;

import br.com.forge.model.Discipulador;
import br.com.forge.model.ForgeObject;

public class DiscipuladorTest {

	private static final String NOME_DISCIPULADOR = "Nome Discipulador";

	@Test
	public void testClassSuperClass() throws Exception {
		Assert.assertTrue(new Discipulador() instanceof ForgeObject);
	}
	
	@Test
	public void testClassAnnotations(){
		Assert.assertTrue(Discipulador.class.isAnnotationPresent(Entity.class));
	}
	
	@Test
	public void testGetAndSetters() {
		Discipulador discipuldor = createDiscipulador();
		Assert.assertEquals(NOME_DISCIPULADOR, discipuldor.getNome());
	}

	private Discipulador createDiscipulador() {
		Discipulador discipulador = new Discipulador();
		discipulador.setNome(NOME_DISCIPULADOR);
		return discipulador;
	}
}
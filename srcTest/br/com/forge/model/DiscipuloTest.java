package br.com.forge.model;

import javax.persistence.Entity;
import junit.framework.Assert;
import org.junit.Test;

import br.com.forge.model.Discipulo;
import br.com.forge.model.ForgeObject;

public class DiscipuloTest {

	private static final String NOME_DISCIPULO = "Nome Discipulo";

	public void testClassSuperClass() throws Exception {
		Assert.assertTrue(new Discipulo() instanceof ForgeObject);
	}
	
	@Test
	public void testClassAnnotation() {
		Assert.assertTrue(Discipulo.class.isAnnotationPresent(Entity.class));
	}
	
	@Test
	public void testGettersAndSetters(){
		Discipulo discipulo = createDiscipulo();
		Assert.assertEquals(NOME_DISCIPULO, discipulo.getNome());
	}

	private Discipulo createDiscipulo() {
		Discipulo discipulo = new Discipulo();
		discipulo.setNome(NOME_DISCIPULO);
		return discipulo;
	}
}
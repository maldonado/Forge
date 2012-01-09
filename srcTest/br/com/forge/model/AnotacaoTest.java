package br.com.forge.model;

import javax.persistence.Entity;
import junit.framework.Assert;
import org.junit.Test;

import br.com.forge.model.Anotacao;
import br.com.forge.model.ForgeObject;

public class AnotacaoTest {

	private static final String DESCRICAO = "descricao";

	@Test
	public void testClassSuperClass() {
		Assert.assertTrue(new Anotacao() instanceof ForgeObject);
	}
	
	@Test
	public void testClassAnnotations(){
		Assert.assertTrue(Anotacao.class.isAnnotationPresent(Entity.class));
	}
	
	@Test
	public void testGettersAndSetters() throws Exception {
		Anotacao anotacao = createAnotacao();
		Assert.assertEquals(DESCRICAO, anotacao.getDescricao());
	}

	private Anotacao createAnotacao() {
		Anotacao anotacao = new Anotacao();
		anotacao.setDescricao(DESCRICAO);
		return anotacao;
	}
}
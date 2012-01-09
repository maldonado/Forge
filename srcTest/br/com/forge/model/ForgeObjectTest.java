package br.com.forge.model;

import java.lang.reflect.Field;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import junit.framework.Assert;

import org.joda.time.DateMidnight;
import org.junit.Test;

import br.com.forge.model.ForgeObject;

public class ForgeObjectTest {

	private static final Long CLASS_ID = 123l;
	private static final String ID_FIELD_NAME = "id";
	private static final DateMidnight DATA_CRIACAO = new DateMidnight();

	@Test
	public void testIdFieldAnnotations() throws SecurityException, NoSuchFieldException{
		Field idField = ForTest.class.getSuperclass().getDeclaredField(ID_FIELD_NAME);
		Assert.assertTrue(idField.isAnnotationPresent(Id.class));
		Assert.assertTrue(idField.isAnnotationPresent(GeneratedValue.class));
	}
	
	@Test
	public void testGettersAndSetters() {
		ForTest forTestClass = new ForTest();
		Assert.assertEquals(CLASS_ID, forTestClass.getId());
		Assert.assertEquals(DATA_CRIACAO, forTestClass.getDataCriacao());
	}
	
	private class ForTest extends ForgeObject{

		{
			setId(CLASS_ID);
			setDataCriacao(DATA_CRIACAO);
		}
	}
}
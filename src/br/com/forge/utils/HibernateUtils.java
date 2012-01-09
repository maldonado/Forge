package br.com.forge.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.forge.model.Anotacao;
import br.com.forge.model.Discipulador;
import br.com.forge.model.Discipulo;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory;
	
	static {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Discipulador.class);
		configuration.addAnnotatedClass(Discipulo.class);
		configuration.addAnnotatedClass(Anotacao.class);
		sessionFactory = configuration.buildSessionFactory();
	}
	
	public Session getSession(){
		return sessionFactory.openSession();
	}
	
	public void closeSession(){
		sessionFactory.close();
	}
}

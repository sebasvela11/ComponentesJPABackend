package com.componentes.ulatina.entitymanagerfactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryControlador {
	
	private static EntityManager em = null;
	private static EntityManagerFactory entityManagerFactory = null;
	
	public static void startEntityManagerFactory(String persistenceUnit) throws Exception {
		if (entityManagerFactory == null) {
			try {
				entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);
				em = entityManagerFactory.createEntityManager();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void stopEntityManagerFactory() throws Exception {
		if (entityManagerFactory != null) {
			if (entityManagerFactory.isOpen()) {
				try {
					entityManagerFactory.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			entityManagerFactory = null;
		}
	}
}

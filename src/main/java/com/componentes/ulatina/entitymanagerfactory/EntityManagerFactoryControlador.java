package com.componentes.ulatina.entitymanagerfactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryControlador {
	
	private static EntityManager em = null;
	private static EntityManagerFactory entityManagerFactory = null;
	
	public static void startEntityManagerFactory() throws Exception {
		if (entityManagerFactory == null) {
			try {
				entityManagerFactory = Persistence.createEntityManagerFactory("ComponentesJPABackend");
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

	public static EntityManager getEm() {
		return em;
	}

	public static void setEm(EntityManager em) {
		EntityManagerFactoryControlador.em = em;
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		EntityManagerFactoryControlador.entityManagerFactory = entityManagerFactory;
	}
	
	
}

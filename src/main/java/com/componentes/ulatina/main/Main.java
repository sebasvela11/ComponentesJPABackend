package com.componentes.ulatina.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	private static EntityManager em = null;
	private static EntityManagerFactory entityManagerFactory = null;
	
	public void main(String[] args) {
		try {
			startEntityManagerFactory("ComponentesJPABackend");
			em = entityManagerFactory.createEntityManager();
			em.getTransaction().begin();
			em.getTransaction().commit();
			stopEntityManagerFactory();
		}catch (Exception e) {
			
		}
		
	}
	public void startEntityManagerFactory(String persistenceUnit) throws Exception {
		if (entityManagerFactory == null) {
			try {
				entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);
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
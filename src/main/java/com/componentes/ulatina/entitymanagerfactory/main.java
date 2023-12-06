package com.componentes.ulatina.entitymanagerfactory;

public class main {

	public static void main(String[] args) throws Exception {
		EntityManagerFactoryControlador eMFC = new EntityManagerFactoryControlador();
		eMFC.startEntityManagerFactory();
		eMFC.getEm().getTransaction().begin();
		eMFC.getEm().getTransaction().commit();
		eMFC.stopEntityManagerFactory();
	}

}

package com.manish.javadev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerManager {
	public static void main(String[] a) throws Exception {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAService");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();
		
		Customer cust = new Customer("Manish", "Srivastava", 29);
		
		entityManager.persist(cust);
		entityManager.flush();
		
		entityManager.getTransaction().commit();
		entityManager.close();
		emf.close();
		
		System.out.println("Done");
	}
}
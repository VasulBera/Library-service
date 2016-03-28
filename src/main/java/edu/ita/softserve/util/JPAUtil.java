package edu.ita.softserve.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManager entityManager = Persistence.createEntityManagerFactory("persistenceUnit")
			.createEntityManager();
	
	public static EntityManager getEntityManager(){
		return entityManager;
	}
}

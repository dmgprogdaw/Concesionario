package Concesionario.modelo.concesionario;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.ConcesionarioBean;

public class CreateConcesionario {

	
	public void create(ConcesionarioBean concesionario) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(concesionario);
		entityManager.getTransaction().commit();
	}
}

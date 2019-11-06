package Concesionario.modelo.coche;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.CocheBean;

public class CreateCoche {

	
	public void create(CocheBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(coche);
		entityManager.getTransaction().commit();
	}
}

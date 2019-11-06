package Concesionario.modelo.coche;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.CocheBean;

public class DeleteCoches {

	public void delete(CocheBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		CocheBean cocheBorrar = entityManager.find(CocheBean.class, coche.getId());	
		entityManager.remove(cocheBorrar);
		entityManager.getTransaction().commit();
	}
}

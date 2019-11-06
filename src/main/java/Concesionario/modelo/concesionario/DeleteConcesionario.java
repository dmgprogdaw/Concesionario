package Concesionario.modelo.concesionario;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.ConcesionarioBean;

public class DeleteConcesionario {

	
	public void delete(ConcesionarioBean concesionario) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		ConcesionarioBean concesionarioBorrar = entityManager.find(ConcesionarioBean.class, concesionario.getId());	
		entityManager.remove(concesionarioBorrar);
		entityManager.getTransaction().commit();
	}
}
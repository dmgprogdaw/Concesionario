package Concesionario.modelo.reparacion;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.ReparacionesBean;

public class CreateReparaciones {

	
	public void create(ReparacionesBean reparaciones) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(reparaciones);
		entityManager.getTransaction().commit();
	}
}

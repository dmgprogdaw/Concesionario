package Concesionario.modelo.trabajador;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.TrabajadorBean;

public class CreateTrabajador {

	
	public void create(TrabajadorBean trabajador) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
	}
}

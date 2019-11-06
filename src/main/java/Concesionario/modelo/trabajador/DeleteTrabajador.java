package Concesionario.modelo.trabajador;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.TrabajadorBean;

public class DeleteTrabajador {

	public void delete(TrabajadorBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		TrabajadorBean trabajadorBorrar = entityManager.find(TrabajadorBean.class, coche.getId());	
		entityManager.remove(trabajadorBorrar);
		entityManager.getTransaction().commit();
	}
}

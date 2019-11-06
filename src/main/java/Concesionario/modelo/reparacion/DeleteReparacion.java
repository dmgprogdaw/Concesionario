package Concesionario.modelo.reparacion;

import javax.persistence.EntityManager;

import Concesionario.modelo.util.ConnectionEntityManagerFactory;
import Concesionario.negocio.ReparacionesBean;

public class DeleteReparacion {

	public void delete(ReparacionesBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		ReparacionesBean reparacionesBorrar = entityManager.find(ReparacionesBean.class, coche.getId());	
		entityManager.remove(reparacionesBorrar);
		entityManager.getTransaction().commit();
	}
}

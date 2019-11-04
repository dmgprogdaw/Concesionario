package EjercicioAccesoDatos.modelo.reparacion;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.ReparacionesBean;

public class CreateReparaciones {

	
	public void create(ReparacionesBean reparaciones) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(reparaciones);
		entityManager.getTransaction().commit();
	}
}

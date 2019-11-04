package EjercicioAccesoDatos.modelo.trabajador;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.TrabajadorBean;

public class CreateTrabajador {

	
	public void create(TrabajadorBean trabajador) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(trabajador);
		entityManager.getTransaction().commit();
	}
}

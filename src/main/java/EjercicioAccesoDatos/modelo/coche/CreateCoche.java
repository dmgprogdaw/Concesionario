package EjercicioAccesoDatos.modelo.coche;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.CocheBean;

public class CreateCoche {

	
	public void create(CocheBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(coche);
		entityManager.getTransaction().commit();
	}
}

package EjercicioAccesoDatos.modelo.concesionario;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.ConcesionarioBean;

public class DeleteConcesionario {

	
	public void delete(ConcesionarioBean concesionario) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		ConcesionarioBean concesionarioBorrar = entityManager.find(ConcesionarioBean.class, concesionario.getId());	
		entityManager.remove(concesionarioBorrar);
		entityManager.getTransaction().commit();
	}
}
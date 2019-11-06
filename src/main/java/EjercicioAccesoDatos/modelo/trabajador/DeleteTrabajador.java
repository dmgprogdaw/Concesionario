package EjercicioAccesoDatos.modelo.trabajador;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.TrabajadorBean;

public class DeleteTrabajador {

	public void delete(TrabajadorBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		TrabajadorBean trabajadorBorrar = entityManager.find(TrabajadorBean.class, coche.getId());	
		entityManager.remove(trabajadorBorrar);
		entityManager.getTransaction().commit();
	}
}

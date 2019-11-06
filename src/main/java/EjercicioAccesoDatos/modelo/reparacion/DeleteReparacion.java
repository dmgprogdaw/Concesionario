package EjercicioAccesoDatos.modelo.reparacion;

import javax.persistence.EntityManager;

import EjercicioAccesoDatos.modelo.util.ConnectionEntityManagerFactory;
import EjercicioAccesoDatos.negocio.ReparacionesBean;

public class DeleteReparacion {

	public void delete(ReparacionesBean coche) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		ReparacionesBean reparacionesBorrar = entityManager.find(ReparacionesBean.class, coche.getId());	
		entityManager.remove(reparacionesBorrar);
		entityManager.getTransaction().commit();
	}
}

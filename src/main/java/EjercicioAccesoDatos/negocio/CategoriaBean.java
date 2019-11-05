package EjercicioAccesoDatos.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categorias", uniqueConstraints=@UniqueConstraint(columnNames= {"categoria"}))
public class CategoriaBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	
	@Column
	private String categoria;
	
	@Column
	private int aumento;
	
	@OneToMany(mappedBy="categoria")
	private List<TrabajadorBean> trabajadores= new ArrayList<TrabajadorBean>();
	
	
	public void addTrabajador(TrabajadorBean trabajador) {
		
		if(!trabajadores.contains(trabajador)) {
			
			trabajadores.add(trabajador);
		}
	}
	
	
	public List<TrabajadorBean> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(List<TrabajadorBean> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAumento() {
		return aumento;
	}

	public void setAumento(int aumento) {
		this.aumento = aumento;
	}
}

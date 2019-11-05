package EjercicioAccesoDatos.negocio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="concesionarios", uniqueConstraints = @UniqueConstraint(columnNames= {"cif", "telefono"}))
public class ConcesionarioBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="numConcesionario")
	private long id;
	
	@Column
	private String cif; 
	
	@Column
	private String nombre;
	
	@Column
	private String localidad;
	
	@Column
	private String provinvia;
	
	@Column
	private String telefono;
	
	@ManyToMany(mappedBy="concesionarioCoches")
	private List<CocheBean> coches = new ArrayList<CocheBean>();
	
	@OneToMany(mappedBy="concesionario")
	private List<TrabajadorBean> trabajadores = new ArrayList<TrabajadorBean>();
	
	
	public void addCoche(CocheBean coche) {
		
		if(!coches.contains(coche)) {
			
			coches.add(coche);
			List<ConcesionarioBean> coches = coche.getConcesionarios();
			if(!coches.contains(this)) {
				
				coches.add(this);
			}
		}
	}
	
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

	public List<CocheBean> getListaCoches() {
		return coches;
	}

	public void setListaCoches(List<CocheBean> coches) {
		this.coches = coches;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvinvia() {
		return provinvia;
	}

	public void setProvinvia(String provinvia) {
		this.provinvia = provinvia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<CocheBean> getCoches() {
		return coches;
	}

	public void setCoches(List<CocheBean> coches) {
		this.coches = coches;
	}
	
	
}

package EjercicioAccesoDatos.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="coches", uniqueConstraints = @UniqueConstraint(columnNames="bastidor"))
public class CocheBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="numCoche")
	private long id; 
	
	@Column
	private String bastidor;
	
	@Column
	private String modelo;
	
	@Column
	private String color;
	
	@Column
	private int plazas;
	
	@Column
	private int caballos;
	
	@Column
	private String ejes;
	
	@Column
	private double precioMinimo;
	
	@ManyToMany
	private List<ConcesionarioBean> concesionarioCoches = new ArrayList<ConcesionarioBean>();

	public List<ConcesionarioBean> getConcesionarios() {
		return concesionarioCoches;
	}

	public void setConcesionarios(List<ConcesionarioBean> concesionarioCoches) {
		this.concesionarioCoches = concesionarioCoches;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getEjes() {
		return ejes;
	}

	public void setEjes(String ejes) {
		this.ejes = ejes;
	}

	public double getPrecioMinimo() {
		return precioMinimo;
	}

	public void setPrecioMinimo(double precioMinimo) {
		this.precioMinimo = precioMinimo;
	}
}

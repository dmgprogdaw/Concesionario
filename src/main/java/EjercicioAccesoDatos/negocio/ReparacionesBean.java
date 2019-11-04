package EjercicioAccesoDatos.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="reparaciones")
public class ReparacionesBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String matricula;
	
	@Column
	private String marca;
	
	@ManyToOne
	@JoinColumn(name="FK_modelo")
	private CocheBean modelo;
	
	@ManyToOne
	@JoinColumn(name="FK_color")
	private CocheBean color;
	
	@ManyToOne
	@JoinColumn(name="FK_bastidor")
	private CocheBean bastidor;
	
	@Column
	private String descripcionAveria;
	
	@Column
	private double presupuesto;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public CocheBean getModelo() {
		return modelo;
	}

	public void setModelo(CocheBean modelo) {
		this.modelo = modelo;
	}

	public CocheBean getColor() {
		return color;
	}

	public void setColor(CocheBean color) {
		this.color = color;
	}

	public CocheBean getBastidor() {
		return bastidor;
	}

	public void setBastidor(CocheBean bastidor) {
		this.bastidor = bastidor;
	}

	public String getDescripcionAveria() {
		return descripcionAveria;
	}

	public void setDescripcionAveria(String descripcionAveria) {
		this.descripcionAveria = descripcionAveria;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

}

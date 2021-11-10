package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="Servicio")
public class Servicio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServicio;
	
	@ManyToOne
	@JoinColumn(name="idTipoServicio", nullable=false)
	private TipoServicio tipoServicio;
	@ManyToOne
	@JoinColumn(name="idEmpresaServicio", nullable=false)
	private CompanyService idEmpresaServicio;
	
	@Column(name="nombreServicio", length=40, nullable=false)
	private String nombre;
	
	@Column(name="lugar", length=70, nullable=false)
	private String lugar;
	
	@Column(name="direccion", length=70, nullable=false)
	private String direccion;
	
	@Column(name="imagen", length=70, nullable=false)
	private String imagen;

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Servicio(int idServicio, TipoServicio tipoServicio, CompanyService idEmpresaServicio, String nombre,
			String lugar, String direccion, String imagen) {
		super();
		this.idServicio = idServicio;
		this.tipoServicio = tipoServicio;
		this.idEmpresaServicio = idEmpresaServicio;
		this.nombre = nombre;
		this.lugar = lugar;
		this.direccion = direccion;
		this.imagen = imagen;
	}

	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public CompanyService getIdEmpresaServicio() {
		return idEmpresaServicio;
	}

	public void setIdEmpresaServicio(CompanyService idEmpresaServicio) {
		this.idEmpresaServicio = idEmpresaServicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}

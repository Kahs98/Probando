package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ubicacion;
	
	@Column(name="latitud", nullable=false, length=50)
	private int latitud;
	
	@Column(name="longitud", nullable=false, length=50)
	private int longitud;

	public Location() {
		super();
	}

	public Location(int id_ubicacion, int latitud, int longitud) {
		super();
		this.id_ubicacion = id_ubicacion;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(int id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}

	public int getLatitud() {
		return latitud;
	}

	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	
}

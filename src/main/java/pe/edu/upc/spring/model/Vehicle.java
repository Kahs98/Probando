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
@Table(name="Vehicuo")
public class Vehicle implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vehiculo;
	
	@Column(name="nombre", nullable=false, length=150)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_cliente", nullable=false)
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="id_ubicacion", nullable=false)
	private Location location;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id_vehiculo, String nombre, Client client, Location location) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.nombre = nombre;
		this.client = client;
		this.location = location;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	
}

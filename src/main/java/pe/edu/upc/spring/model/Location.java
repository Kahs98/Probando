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
@Table(name = "Location")
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLocation;
	
	@ManyToOne
	@JoinColumn(name = "idVehicle", nullable = false)
	private Vehicle idVehicle;
	
	@Column(name = "latitude", length = 60, nullable = false)
	private int latitude;
	
	@Column(name = "longitude", length = 60, nullable = false)
	private int longitude;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(int idLocation, Vehicle idVehicle, int latitude, int longitude) {
		super();
		this.idLocation = idLocation;
		this.idVehicle = idVehicle;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(int idLocation) {
		this.idLocation = idLocation;
	}

	public Vehicle getIdVehicle() {
		return idVehicle;
	}

	public void setIdVehicle(Vehicle idVehicle) {
		this.idVehicle = idVehicle;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	


	

}

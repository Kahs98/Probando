package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ServiceVehicle")
public class ServiceVehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idServiceVehicle;

	@ManyToOne
	@JoinColumn(name = "idService", nullable = false)
	private Service idService;
	
	@ManyToOne
	@JoinColumn(name = "idVehicle", nullable = false)
	private Vehicle idVehicle;

	public ServiceVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceVehicle(int idServiceVehicle, Service idService, Vehicle idVehicle) {
		super();
		this.idServiceVehicle = idServiceVehicle;
		this.idService = idService;
		this.idVehicle = idVehicle;
	}

	public int getIdServiceVehicle() {
		return idServiceVehicle;
	}

	public void setIdServiceVehicle(int idServiceVehicle) {
		this.idServiceVehicle = idServiceVehicle;
	}

	public Service getIdService() {
		return idService;
	}

	public void setIdService(Service idService) {
		this.idService = idService;
	}

	public Vehicle getIdVehicle() {
		return idVehicle;
	}

	public void setIdVehicle(Vehicle idVehicle) {
		this.idVehicle = idVehicle;
	}
	
	

}

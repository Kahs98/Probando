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
@Table(name = "Vehicle")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVehicle;
	
	@ManyToOne
	@JoinColumn(name = "idUser", nullable = false)
	private User user;
	
	@Column(name = "nameActor", length = 60, nullable = false)
	private String nameActor;
	
	@Column(name="imgActor", length=200, nullable=false)
	private String imgActor;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int idVehicle, User user, String nameActor, String imgActor) {
		super();
		this.idVehicle = idVehicle;
		this.user = user;
		this.nameActor = nameActor;
		this.imgActor = imgActor;
	}

	public int getIdVehicle() {
		return idVehicle;
	}

	public void setIdVehicle(int idVehicle) {
		this.idVehicle = idVehicle;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNameActor() {
		return nameActor;
	}

	public void setNameActor(String nameActor) {
		this.nameActor = nameActor;
	}

	public String getImgActor() {
		return imgActor;
	}

	public void setImgActor(String imgActor) {
		this.imgActor = imgActor;
	}
	
	

}

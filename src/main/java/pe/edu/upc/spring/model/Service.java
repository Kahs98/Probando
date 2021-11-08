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
@Table(name = "Service")
public class Service implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idService;
	
	@ManyToOne
	@JoinColumn(name = "idUser", nullable = false)
	private User user;
	
	@Column(name = "nameService", length = 60, nullable = false)
	private String nameService;
	
	@Column(name = "placeService", length = 60, nullable = false)
	private String placeService;
	
	@Column(name = "addressService", length = 60, nullable = false)
	private String addressService;
	
	@Column(name="starsService", length=200, nullable=false)
	private int starsService;
	
	@Column(name="imgService", length=200, nullable=false)
	private String imgService;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(int idService, User user, String nameService, String placeService, String addressService,
			int starsService, String imgActor) {
		super();
		this.idService = idService;
		this.user = user;
		this.nameService = nameService;
		this.placeService = placeService;
		this.addressService = addressService;
		this.starsService = starsService;
		this.imgService = imgActor;
	}

	public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNameService() {
		return nameService;
	}

	public void setNameService(String nameService) {
		this.nameService = nameService;
	}

	public String getPlaceService() {
		return placeService;
	}

	public void setPlaceService(String placeService) {
		this.placeService = placeService;
	}

	public String getAddressService() {
		return addressService;
	}

	public void setAddressService(String addressService) {
		this.addressService = addressService;
	}

	public int getStarsService() {
		return starsService;
	}

	public void setStarsService(int starsService) {
		this.starsService = starsService;
	}

	public String getimgService() {
		return imgService;
	}

	public void setimgService(String imgService) {
		this.imgService = imgService;
	}
	
	
	
	

}

package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EmpresaServicio")
public class CompanyService implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_company_service;
	
	@Column(name="nombre", nullable=false, length=80)
	private String name;
	
	@Column(name="apellidos", nullable=false, length=100)
	private String lastname;
	
	@Column(name="nombre_empresa", nullable=false, length=150)
	private String nameCompanyService;
	
	@Column(name="email", nullable=false, length=100)
	private String email;
	
	@Column(name="celular", nullable=false, length=20)
	private String phone;
	
	
	@OneToOne
	@JoinColumn(name="id_usuario", nullable=false)
	private User user;


	public CompanyService(int id_company_service, String name, String lastname, String nameCompanyService, String email,
			String phone, User user) {
		super();
		this.id_company_service = id_company_service;
		this.name = name;
		this.lastname = lastname;
		this.nameCompanyService = nameCompanyService;
		this.email = email;
		this.phone = phone;
		this.user = user;
	}


	public int getId_cleaning_staff() {
		return id_company_service;
	}


	public void setId_cleaning_staff(int id_cleaning_staff) {
		this.id_company_service = id_cleaning_staff;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getNameCompanyService() {
		return nameCompanyService;
	}


	public void setNameCompanyService(String nameCompanyService) {
		this.nameCompanyService = nameCompanyService;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
	
	
	
}
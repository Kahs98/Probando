package pe.edu.upc.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Column(name="nameUser", nullable=false, length=60)
	private String nameUser;
	
	@Column(name="emailUser", nullable=false, length=60)
	private String emailUser;
	
	@Column(name="passwordUser", nullable=false, length=30)
	private String passwordUser;
	 
	
	@Column(name="passwordConfirmUser", nullable=false, length=30)
	private String passwordConfirmUser;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int idUser, String nameUser, String emailUser, String passwordUser, String passwordConfirmUser) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
		this.passwordConfirmUser = passwordConfirmUser;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getPasswordConfirmUser() {
		return passwordConfirmUser;
	}

	public void setPasswordConfirmUser(String passwordConfirmUser) {
		this.passwordConfirmUser = passwordConfirmUser;
	}

	
}
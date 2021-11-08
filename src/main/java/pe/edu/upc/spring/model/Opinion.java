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
@Table(name = "Opinion")
public class Opinion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOpinion;
	
	@ManyToOne
	@JoinColumn(name = "idUser", nullable = false)
	private User user;
	
	@Column(name = "descriptionOpinion", length = 60, nullable = false)
	private String descriptionOpinion;
	

	public Opinion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Opinion(int idOpinion, User user, String descriptionOpinion) {
		super();
		this.idOpinion = idOpinion;
		this.user = user;
		this.descriptionOpinion = descriptionOpinion;
	}


	public int getIdOpinion() {
		return idOpinion;
	}


	public void setIdOpinion(int idOpinion) {
		this.idOpinion = idOpinion;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDescriptionOpinion() {
		return descriptionOpinion;
	}


	public void setDescriptionOpinion(String descriptionOpinion) {
		this.descriptionOpinion = descriptionOpinion;
	}

	
	
	

}

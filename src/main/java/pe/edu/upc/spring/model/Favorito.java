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
@Table(name="Favorito")
public class Favorito implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFavorito;
	
	@ManyToOne
	@JoinColumn(name="idCliente", nullable=false)
	private Client cliente;
	
	@ManyToOne
	@JoinColumn(name="idServicio", nullable=true)
	private Servicio servicio;

	public Favorito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Favorito(int idFavorito, Client cliente, Servicio servicio) {
		super();
		this.idFavorito = idFavorito;
		this.cliente = cliente;
		this.servicio = servicio;
	}

	public int getIdFavorito() {
		return idFavorito;
	}

	public void setIdFavorito(int idFavorito) {
		this.idFavorito = idFavorito;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	
}

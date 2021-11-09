package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Favorito;

public interface IFavoritoService {
	public boolean registrar(Favorito favorito);
	public void eliminar(int idFavorito);
	public Optional<Favorito> buscarId(int idFavorito);
	List<Favorito> listar();
	List<Favorito> listarServicios(int idCliente);
}

package pe.edu.upc.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.upc.spring.model.Favorito;

public interface IFavoritoRepository extends JpaRepository<Favorito, Integer>{
	//Panel cliente
	
	@Query("from Favorito f where f.servicio is null and f.cliente.idCliente = :idCliente")
	List<Favorito> listarServicios(@Param("idCliente") int idCliente);
}

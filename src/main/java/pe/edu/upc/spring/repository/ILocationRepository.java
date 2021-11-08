package pe.edu.upc.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.spring.model.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Integer> {
	@Query("from Location l where l.latitude like %:latitude% order by l.idVehicle ASC")
	List<Location> findByLatitude(@Param("latitude") int latitude);
	
	@Query("from Location l where l.longitude like %:longitude% order by l.idVehicle ASC")
	List<Location> findByLongitude(@Param("longitude") int longitude);
	

}

package pe.edu.upc.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.spring.model.ServiceVehicle;

@Repository
public interface IServiceVehicleRepository extends JpaRepository<ServiceVehicle, Integer> {
	@Query("from ServiceVehicle sv where sv.service.nameService like %:nameService% order by sv.idServiceVehicle ASC")
	List<ServiceVehicle> findByMovieName(@Param("nameService") String nameService);
	
	@Query("from ServiceVehicle sv where sv.vehicle.nameVehicle like %:nameVehicle% order by sv.idServiceVehicle ASC")
	List<ServiceVehicle> findByActorName(@Param("nameVehicle") String nameVehicle);
}

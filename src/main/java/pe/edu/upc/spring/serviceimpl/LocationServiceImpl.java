package pe.edu.upc.spring.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.spring.model.Location;
import pe.edu.upc.spring.repository.iLocationRepository;
import pe.edu.upc.spring.service.iLocationService;

@Service
public class LocationServiceImpl implements iLocationService{

	@Autowired
	private iLocationRepository dLocation;
	
	@Override
	@Transactional(readOnly = true)
	public List<Location> listLocation() {
		return dLocation.findAll();
	}

}

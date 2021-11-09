package pe.edu.upc.spring.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sun.el.parser.ParseException;

import pe.edu.upc.spring.model.Location;
import pe.edu.upc.spring.model.Vehicle;

import pe.edu.upc.spring.service.iLocationService;
import pe.edu.upc.spring.service.iVehicleService;
import pe.edu.upc.spring.utils.Sesion;

@Controller
@RequestMapping("/property")
public class VehicleController {

	@Autowired
	private Sesion sesion;
	
	@Autowired
	private iVehicleService pService;
	
	@Autowired
	private iLocationService dService;
	
	@RequestMapping("/list")
	public String goPageListProperties(Map<String, Object> model) {
		model.put("listProp", pService.findByClientId(sesion.getClient().getId_client()));
		return "/property/listProperties";
	}
	
	@RequestMapping("/register")
	public String goPageRegister(Model model) {
		model.addAttribute("vehicle", new Vehicle());
		model.addAttribute("location", new Location());
		model.addAttribute("listLocation", dService.listLocation());
		
		return "/property/Property";
	}
	
	@RequestMapping("/registerProperty")
	public String register(@ModelAttribute Vehicle objVehicle, BindingResult binRes, Model model)
			throws ParseException
	{
		if (objVehicle.getClient()==null) {
			objVehicle.setClient(sesion.getClient());	
		}
		
		if (binRes.hasErrors())
			return "/vehicle/Vehicle";
		else {
			boolean flag = pService.createVehicle(objVehicle);
			if (flag)
				return "redirect:/vehicle/list";
			else {
				model.addAttribute("mensaje", "Ocurrio un error");
				return "redirect:/vehicle/register";
			}
		}
	}
	
	@RequestMapping("/delete")
	public String deleteProperty(Map<String, Object> model, @RequestParam(value="id") Integer id) {
		try {
			if (id!=null && id>0) {
				pService.deleteVehicle(id);
				model.put("listVehi", pService.findByClientId(sesion.getClient().getId_client()));
			}
		}
		catch(Exception ex) {
			model.put("mensaje","El vehiculo no se puede eliminar");
			model.put("listProp", pService.findByClientId(sesion.getClient().getId_client()));
		}
		return "vehiculo/listVehicles";
	}

	@RequestMapping("/edit/{id}")
	public String editProperty(@PathVariable int id, Model model, RedirectAttributes objRedir)
		throws ParseException 
	{
		Optional<Vehicle> objVehicle = pService.findById(id);
		if (objVehicle == null) {
			objRedir.addFlashAttribute("mensaje", "Ocurrio un error");
			return "redirect:/vehicle/list";
		}
		else {
			model.addAttribute("listDistrict", dService.listLocation());
			if (objVehicle.isPresent())
				objVehicle.ifPresent(p -> model.addAttribute("vehicle", p));
			return "vehicle/vehicleUpdate";
		}
	}
}
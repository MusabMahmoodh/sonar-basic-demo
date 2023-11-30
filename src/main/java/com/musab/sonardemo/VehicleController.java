package com.musab.sonardemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	private final VehicleService vehicleService;

	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

	@RequestMapping("/get")
	public Vehicle getVehicle() {
		return vehicleService.getVehicle();
	}

	@RequestMapping("/getById")
	public Vehicle getVehicleById(int id) {
		return vehicleService.getVehicleById(id);
	}

	@RequestMapping("/getByName")
	public Vehicle getVehicleByName(String name) {
		return vehicleService.getVehicleByName(name);
	}

	@RequestMapping("/getByType")
	public Vehicle getVehicleByType(String type) {
		return vehicleService.getVehicleByType(type);
	}


}

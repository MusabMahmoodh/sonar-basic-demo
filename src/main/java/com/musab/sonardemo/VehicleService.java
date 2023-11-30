package com.musab.sonardemo;

import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	private VehicleRepository vehicleRepository;

	public VehicleService(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	public Vehicle getVehicle() {
		return vehicleRepository.getVehicle();
	}

	public Vehicle getVehicleById(int id) {
		return vehicleRepository.getVehicleById(id);
	}

	public Vehicle getVehicleByName(String name) {
		return vehicleRepository.getVehicleByName(name);
	}

	public Vehicle getVehicleByType(String type) {
		return vehicleRepository.getVehicleByType(type);
	}

}

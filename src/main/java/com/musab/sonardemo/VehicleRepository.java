package com.musab.sonardemo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class VehicleRepository {

	List<Vehicle> vehicles = Arrays.asList(
		new Vehicle("1", "Car", "Sedan"),
		new Vehicle("2", "Truck", "Pickup"),
		new Vehicle("3", "Motorcycle", "Street"),
		new Vehicle("4", "SUV", "Crossover"),
		new Vehicle("5", "Van", "Minivan")
	);


	public Vehicle getVehicle() {
		return new Vehicle("1", "Car", "Sedan");
	}

	public Vehicle getVehicleById(int id) {
		return vehicles.get(id);
	}

	public Vehicle getVehicleByName(String name) {
		return vehicles.stream().filter(v -> v.getName().equals(name)).findFirst().get();
	}

	public Vehicle getVehicleByType(String type) {
		return vehicles.stream().filter(v -> v.getType().equals(type)).findFirst().get();
	}
}

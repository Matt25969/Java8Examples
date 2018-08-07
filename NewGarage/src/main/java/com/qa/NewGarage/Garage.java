package com.qa.NewGarage;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Garage {

	CostCalculator calcFunction = (Vehicle v) -> {

		switch (v.getClass().getSimpleName()) {
		case "Car":
			return ((Car) v).getNumberOfDoors() * 10;
		case "Boat":
			return ((Boat) v).getNumberOfLifeJackets() * 4;
		case "Plane":
			return ((Plane) v).getNumberOfParachutes() * 8;
		default:
			return -1;
		}

	};

	private ArrayList<Vehicle> vehicleList = new ArrayList<>();

	public void addVehicle(Vehicle v) {

		vehicleList.add(v);

	}

	public void searchForVehicle(String ID) {

		this.getVehicleList().stream().filter(p -> p.getID().equals(ID)).forEach(System.out::println);
	}

	public void calculateCostForEachVehicle() {

		vehicleList.stream().map(p -> calcFunction.calculate(p)).collect(Collectors.toList()).stream()
				.forEach(System.out::println);

	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

}

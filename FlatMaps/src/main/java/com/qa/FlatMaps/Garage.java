package com.qa.FlatMaps;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garageList = new ArrayList<>();

	public List<Vehicle> getGarageList() {
		return garageList;
	}

	public void addVehicle(Vehicle v) {

		garageList.add(v);

	}

}

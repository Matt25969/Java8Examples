package com.qa.NewGarage;

public class Runner {

	public static void main(String[] args) {

		Garage g = new Garage();

		Car c1 = new Car(3, "C001");

		Car c2 = new Car(5, "C002");

		Boat b1 = new Boat(5, "B001");

		Boat b2 = new Boat(8, "B002");

		Plane p1 = new Plane(1, "P001");

		Plane p2 = new Plane(2, "P002");

		g.addVehicle(c1);
		g.addVehicle(c2);
		g.addVehicle(b1);
		g.addVehicle(b2);
		g.addVehicle(p1);
		g.addVehicle(p2);

		g.calculateCostForEachVehicle();

		g.searchForVehicle("C001");

	}

}

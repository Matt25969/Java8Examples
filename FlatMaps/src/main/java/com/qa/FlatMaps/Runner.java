package com.qa.FlatMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		Logic log = new Logic();

		List<Developer> team = new ArrayList<>();
		Developer polyglot = new Developer("esoteric");
		polyglot.add("clojure");
		polyglot.add("scala");
		polyglot.add("groovy");
		polyglot.add("go");
		polyglot.add("java");

		Developer busy = new Developer("pragmatic");
		busy.add("java");
		busy.add("javascript");

		team.add(polyglot);
		team.add(busy);

		log.flatMapExperimentation(team);

		System.out.println("-----------------------------------------------------");

		Garage garage1 = new Garage();

		Garage garage2 = new Garage();

		Garage garage3 = new Garage();

		Vehicle v1 = new Vehicle("A");

		Vehicle v2 = new Vehicle("B");

		Vehicle v3 = new Vehicle("C");

		Vehicle v4 = new Vehicle("D");

		Vehicle v5 = new Vehicle("E");

		Vehicle v6 = new Vehicle("F");

		Vehicle v7 = new Vehicle("G");

		Vehicle v8 = new Vehicle("H");

		Vehicle v9 = new Vehicle("I");

		garage1.addVehicle(v1);
		garage2.addVehicle(v3);
		garage3.addVehicle(v2);
		garage3.addVehicle(v5);
		garage2.addVehicle(v4);
		garage1.addVehicle(v6);
		garage1.addVehicle(v7);
		garage2.addVehicle(v9);
		garage3.addVehicle(v8);

		List<Garage> listOfGarages = new ArrayList<Garage>();

		listOfGarages.add(garage1);

		listOfGarages.add(garage2);

		listOfGarages.add(garage3);

		List<Vehicle> flatList = listOfGarages.stream().map(n -> n.getGarageList()).flatMap(f -> f.stream())
				.collect(Collectors.toList());

		flatList.stream().forEach(System.out::println);
	}

}

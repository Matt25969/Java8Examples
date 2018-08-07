package com.qa.NewGarage;

public class Car extends Vehicle {

	private int numberOfDoors;

	public Car(int numberOfDoors, String ID) {

		super(ID);

		this.numberOfDoors = numberOfDoors;

	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "This is a Car that has the ID " + this.getID() + " and has " + this.getNumberOfDoors() + " doors";
	}

}

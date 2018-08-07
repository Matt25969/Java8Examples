package com.qa.NewGarage;

public class Boat extends Vehicle {

	private int numberOfLifeJackets;

	public Boat(int numberOfLifeJackets, String ID) {

		super(ID);

		this.numberOfLifeJackets = numberOfLifeJackets;

	}

	public int getNumberOfLifeJackets() {
		return numberOfLifeJackets;
	}

	public void setNumberOfLifeJackets(int numberOfLifeJackets) {
		this.numberOfLifeJackets = numberOfLifeJackets;
	}

}

package com.qa.NewGarage;

public class Plane extends Vehicle {

	private int numberOfParachutes;

	public Plane(int numberOfParachutes, String ID) {

		super(ID);

		this.numberOfParachutes = numberOfParachutes;

	}

	public int getNumberOfParachutes() {
		return numberOfParachutes;
	}

	public void setNumberOfParachutes(int numberOfParachutes) {
		this.numberOfParachutes = numberOfParachutes;
	}

}

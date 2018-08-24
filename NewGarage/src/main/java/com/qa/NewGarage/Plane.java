package com.qa.NewGarage;

public class Plane extends Vehicle {

	public Plane(String ID) {
		super(ID);
		// TODO Auto-generated constructor stub
	}

	private int numberOfParachutes;

	public int getNumberOfParachutes() {
		return numberOfParachutes;
	}

	public void setNumberOfParachutes(int numberOfParachutes) {
		this.numberOfParachutes = numberOfParachutes;
	}

}

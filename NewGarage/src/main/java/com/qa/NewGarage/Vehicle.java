package com.qa.NewGarage;

public abstract class Vehicle {

	private String ID;

	public Vehicle(String ID) {

		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
}

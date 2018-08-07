package com.qa.Hospital;

import java.util.Optional;

import Interfaces.IDGen;

public class Patient {

	IDGen gen = (String sex) -> {

		if (counter < 100) {

			if (counter < 10) {
				counter++;
				return sex + "00" + counter;
			}
			counter++;
			return sex + "0" + counter;
		}

		return sex + counter;

	};

	private static int counter;

	private String Sex;

	private String ID;

	private Optional<Team> team;

	private Ward ward;

	private Patient(String sex, Team team, Ward ward) {

		this.setID(gen.generate(sex));
		this.team = Optional.of(team);
		this.setWard(ward);

	}

	public static Patient admitPatient(String sex, Team team, Ward ward) {

		if (ward.getCurrentCapacity() == ward.getMaxCapacity()) {
			return null;
		} else {
			ward.setCurrentCapacity(ward.getCurrentCapacity() + 1);
			return new Patient(sex, team, ward);
		}
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Patient [gen=" + gen + ", Sex=" + Sex + ", ID=" + ID + ", consultant=" + "]";
	}

	public String treat(Doctor doctor) {

		if (doctor.getTeam().equals(team)) {

			return "This patient can be treated by this doctor";

		}

		return "This Patient needs to be treated by a different Doctor";

	}

	public Ward getWard() {
		return ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

}

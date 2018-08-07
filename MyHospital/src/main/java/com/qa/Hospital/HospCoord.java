package com.qa.Hospital;

import java.util.Collection;

public class HospCoord {

	private Collection<Team> teams;
	private Collection<Doctor> doctors;
	private Collection<Patient> patients;

	public static String promoteDoctor(Doctor doctor) {

		if (doctor.getClass().getSimpleName().equals("JuniorDoctor")) {

			switch (doctor.getGrade()) {

			case ONE:
			case TWO:
				return "This Doctor has not yet earned a promotion";

			case THREE:
			case FOUR:

				return "This doctor has been promoted";
			}

		} else {
			System.out.println("This doctor is already a consultant");
		}
		return "";

	}

	public Collection<Team> getTeams() {
		return teams;
	}

	public Collection<Doctor> getDoctors() {
		return doctors;
	}

	public Collection<Patient> getPatients() {
		return patients;
	}

	public ConsultantDoctor createConsultant(String name, Grade grade) {
		return ConsultantDoctor.createConsultant(name, grade);

	}

	public JuniorDoctor createDoctor(String name, Grade grade) {
		return JuniorDoctor.createDoctor(name, grade);
	}

	public Patient admitPatient(String sex, Team team, Ward ward) {
		return Patient.admitPatient(sex, team, ward);
	}

	public Team createTeam(Doctor doctor, Doctor doctor2) {
		return Team.createTeam(doctor, doctor2);
	}

	public Ward createWard(int capacity) {
		return Ward.createWard(capacity);
	}

	// a method that return information about all the doctors taht work in the
	// hospital
	// a method that return information about all the patients taht are in the
	// hospital
	// a method that return information about all the teams that are in the
	// hospital

}

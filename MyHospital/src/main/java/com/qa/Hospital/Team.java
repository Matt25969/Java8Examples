package com.qa.Hospital;

import java.util.ArrayList;
import java.util.Optional;

public class Team {

	private ArrayList<Doctor> teamMembers;

	private Team(Doctor doctor, Doctor doctor2) {

		teamMembers = new ArrayList<>();
		teamMembers.add(doctor);
		teamMembers.add(doctor2);
		doctor.setTeam(this);
		doctor2.setTeam(this);
	}

	public static Team createTeam(Doctor doctor, Doctor doctor2) {

		if (doctor.getClass().getSimpleName().equals("ConsultantDoctor")
				|| doctor2.getClass().getSimpleName().equals("ConsultantDoctor")) {

			System.out.println("The team meets all requirements");

			return new Team(doctor, doctor2);

		} else {
			System.out.println("You have tried to create a team without a consultant");
			return null;
		}

	}

	public String addDoctor(Doctor doctor) {
		if (this.teamMembers.size() >= 4) {
			return "This team has too many Doctors already!";
		}

		if ((doctor.getTeam().equals(Optional.empty()))) {
			teamMembers.add(doctor);
			doctor.setTeam(this);
			return "Doctor successfuly added to team";
		} else {

			return "This Doctor has already been assigned to a team";
		}
	}

	@Override
	public String toString() {
		return "Team [teamMembers=" + teamMembers + "]";
	}

}

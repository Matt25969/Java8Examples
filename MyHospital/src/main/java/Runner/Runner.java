package Runner;

import com.qa.Hospital.ConsultantDoctor;
import com.qa.Hospital.Grade;
import com.qa.Hospital.HospCoord;
import com.qa.Hospital.JuniorDoctor;
import com.qa.Hospital.Patient;
import com.qa.Hospital.Team;
import com.qa.Hospital.Ward;

public class Runner {

	public static void main(String[] args) {

		HospCoord hc = new HospCoord();

		ConsultantDoctor b = hc.createConsultant("Bert", Grade.THREE);

		JuniorDoctor j = hc.createDoctor("Jeff", Grade.ONE);

		JuniorDoctor d = hc.createDoctor("Dave", Grade.ONE);

		JuniorDoctor e = hc.createDoctor("Earl", Grade.ONE);

		Team HeartTeam = hc.createTeam(b, j);

		Ward ward1 = hc.createWard(12);

		System.out.println(HeartTeam.addDoctor(d));

		Patient p = Patient.admitPatient("M", HeartTeam, ward1);

		System.out.println(p.treat(d));
		System.out.println(d.getTeam());

		System.out.println(p.treat(e));
		System.out.println(e.getTeam());

		System.out.println(HeartTeam.toString());

		System.out.println(e.getGrade());

		e.setGrade(Grade.FOUR);

		System.out.println(HospCoord.promoteDoctor(d));

		System.out.println(e.getGrade());

		// hc.getTeams().stream().forEach(System.out::println);

		// a hospital system with the following Business rules

		// a consultant doctor must be at least grade Three
		// a junior doctor can be any grade.
		// a team must have at least one consultant doctor at all times, a team cannot
		// be created and then a consultant Doctor added later.
		// a team must have at least 2 doctors but at most 4 doctors.
		// a patient must be assigned a team of doctors when they are admitted
		// a patient can only be treated by a doctor that is a member of the team they
		// are assigned to
		// a patient must have an auto generated unique ID
		// a patient is assigned to a ward when they are admitted
		// a ward has a limited capacity
		// a doctor can only belong to one team at a time
		// if a doctor is removed from a team there must be at least 2 docotrs left in
		// the team, 1 of whom must be a consultant

		// you are required to create - using TDD
		// a method to treat patients
		// a method to admit patients
		// A method to create a team and assign at least one consultant doctor at
		// creation
		// proof that a team cannot exist without a consultant doctor
		// proof that a patient cannot be admitted to a ward whilst it is full
		// a method to promote a junior doctor to a consultatn doctor
		// a method to remove doctors from a team
		// a method that return information about all the doctors taht work in the
		// hospital
		// a method that return information about all the patients taht are in the
		// hospital
		// a method that return information about all the teams that are in the
		// hospital

	}

}

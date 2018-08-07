package com.qa.Hospital;

public class ConsultantDoctor extends Doctor {

	private ConsultantDoctor(String name, Grade grade) {
		super(name, grade);
		// TODO Auto-generated constructor stub
	}

	public static ConsultantDoctor createConsultant(String name, Grade grade) {

		switch (grade) {
		case ONE:
		case TWO:
			System.out.println("This doctor does not have the required Grade");
			return null;
		case THREE:
		case FOUR:
			System.out.println("This doctor has the required grade and has been created");
			return new ConsultantDoctor(name, grade);

		}
		return null;

	}

}

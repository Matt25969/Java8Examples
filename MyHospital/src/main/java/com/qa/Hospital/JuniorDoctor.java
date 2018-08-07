package com.qa.Hospital;

public class JuniorDoctor extends Doctor {

	private JuniorDoctor(String name, Grade grade) {
		super(name, grade);

	}

	public static JuniorDoctor createDoctor(String string, Grade grade) {

		return new JuniorDoctor(string, grade);
	}

}

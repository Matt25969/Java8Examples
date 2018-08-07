package com.qa.Hospital;

import java.util.Optional;

public abstract class Doctor {

	private String name;

	private Grade grade;

	private Optional<Team> team = Optional.empty();

	public Doctor(String name, Grade grade) {

		this.setName(name);
		this.setGrade(grade);

	}

	public Optional<Team> getTeam() {

		return team;

	}

	public void setTeam(Team team) {
		this.team = Optional.of(team);
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

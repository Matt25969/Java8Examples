package com.qa.NewPeople;

import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> personList = null;

	public PersonManager() {
		personList = new ArrayList<Person>();
	}

	public void addPersonToList(Person person) {

		this.personList.add(person);

	}

	public ArrayList<Person> getPersonList() {
		return personList;
	}

}

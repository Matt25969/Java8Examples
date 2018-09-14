package com.qa.Final;

public class Logic {

	private int age;

	public final String name = "Bert";

	public int notFinalMethod(int a, int b) {

		return a + b;

	}

	public final int finalMultMethod(int a, int b) {

		return a * b;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		// the final field name cannot be altered

		// this.name = name;

	}

	@Override
	public String toString() {
		return "Logic [age=" + age + ", name=" + name + "]";
	}

}

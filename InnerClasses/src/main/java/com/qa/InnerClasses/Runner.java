package com.qa.InnerClasses;

public class Runner {

	public static void main(String[] args) {

		Logic.StaticNestedClass staticNestedClass = new Logic.StaticNestedClass();

		Logic log = new Logic();

		Logic.NestedClass nestedClass = log.new NestedClass();

		// difference between an inner class and static nested class
	}

}

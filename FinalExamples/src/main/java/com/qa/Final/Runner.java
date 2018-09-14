package com.qa.Final;

public class Runner {

	public static void main(String[] args) {

		Logic log = new Logic();

		log.setAge(9);

		System.out.println(log);

		// The final field logic.name cannot be assigned

		// log.name = "Jeff";

		System.out.println(log.notFinalMethod(10, 10));

		System.out.println(log.finalMultMethod(10, 10));

		ExtendsLogic exLog = new ExtendsLogic();

		System.out.println(exLog.notFinalMethod(10, 10));

		System.out.println(exLog.finalMultMethod(10, 10));
	}

}

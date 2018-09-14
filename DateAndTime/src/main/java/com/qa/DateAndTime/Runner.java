package com.qa.DateAndTime;

import java.time.LocalDate;

public class Runner {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		LocalDate tomorrow = localDate.plusYears(5);

		System.out.println(localDate);

		System.out.println(LocalDate.of(2015, 02, 20));

		System.out.println(LocalDate.parse("2015-02-20"));

		System.out.println(localDate.getDayOfWeek());

		System.out.println(localDate.getDayOfMonth());

		System.out.println(localDate.getDayOfYear());

		System.out.println(tomorrow);

		boolean leapYear = LocalDate.now().isLeapYear();

		System.out.println(leapYear);
	}

}

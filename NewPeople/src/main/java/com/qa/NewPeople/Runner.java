package com.qa.NewPeople;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		PersonManager pm = new PersonManager();

		Delegate d1 = new Delegate("Bert");

		Trainer t1 = new Trainer("Jeff");

		pm.addPersonToList(d1);

		pm.addPersonToList(t1);

		// List<Person> result = pm.getPersonList().stream().filter(p ->
		// !"Trainer".equals(p.getClass().getSimpleName()))
		// .collect(Collectors.toList());
		//
		// List<String> result = pm.getPersonList().stream().map(p ->
		// p.getName()).collect(Collectors.toList());
		//
		// List<String> result = pm.getPersonList().stream().filter(p ->
		// !"Trainer".equals(p.getClass()))
		// .map(p -> p.getName()).collect(Collectors.toList());
		//
		// List<String> result = pm.getPersonList().stream().filter(p ->
		// !"Trainer".equals(p.getClass()))
		// .map(p -> p.getName()).collect(Collectors.toList());

		// List<Person> result = pm.getPersonList().stream().map(p -> (Delegate)
		// p).collect(Collectors.toList());

		List<Integer> result = pm.getPersonList().stream().filter(p -> !"Trainer".equals(p.getClass().getSimpleName()))
				.collect(Collectors.toList()).stream().map(p -> ((Delegate) p).getPrice() * 10)
				.collect(Collectors.toList());

		result.stream().forEach(System.out::println);

	}

}

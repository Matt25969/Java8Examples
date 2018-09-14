package com.qa.FlatMaps;

import java.util.List;
import java.util.stream.Collectors;

public class Logic {

	public void flatMapExperimentation(List<Developer> team) {

		List<String> teamLanguages = team.stream().map(d -> d.getLanguages()).flatMap(l -> l.stream())
				.collect(Collectors.toList());

		teamLanguages.stream().forEach(System.out::println);

	}

}

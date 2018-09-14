package com.qa.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableLogic {

	public void thisMethodIsBroken() {

		List<Player> footballTeam = new ArrayList<>();
		Player player1 = new Player(59, "John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Steven", 24);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		System.out.println("Before Sorting : " + footballTeam);
		// this line will break the code as we cannot compare players yet
		// Collections.sort(footballTeam);
		System.out.println("After Sorting : " + footballTeam);

	}

	public void thisMethodIsFixed() {

		List<ComparablePlayer> footballTeam = new ArrayList<>();
		ComparablePlayer player1 = new ComparablePlayer(59, "John", 20);
		ComparablePlayer player2 = new ComparablePlayer(67, "Roger", 22);
		ComparablePlayer player3 = new ComparablePlayer(45, "Steven", 24);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		System.out.println("Before Sorting : " + footballTeam);
		Collections.sort(footballTeam);
		System.out.println("After Sorting : " + footballTeam);

	}

	public void methodWithComparator(Comparator<ComparablePlayer> comparator) {

		List<ComparablePlayer> footballTeam = new ArrayList<>();
		ComparablePlayer player1 = new ComparablePlayer(59, "John", 20);
		ComparablePlayer player2 = new ComparablePlayer(67, "Roger", 22);
		ComparablePlayer player3 = new ComparablePlayer(45, "Steven", 24);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		System.out.println("Before Sorting : " + footballTeam);
		Collections.sort(footballTeam, comparator);
		System.out.println("After Sorting : " + footballTeam);
	}

	public void methodWithLambdas(Comparator<ComparablePlayer> byRanking) {

		List<ComparablePlayer> footballTeam = new ArrayList<>();

		ComparablePlayer player1 = new ComparablePlayer(59, "John", 20);
		ComparablePlayer player2 = new ComparablePlayer(67, "Roger", 22);
		ComparablePlayer player3 = new ComparablePlayer(45, "Steven", 24);

		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		footballTeam.stream().sorted(byRanking).forEach(System.out::println);
	}

}

package com.qa.Comparable;

import java.util.Comparator;

public class Runner {

	public static void main(String[] args) {

		ComparableLogic compLog = new ComparableLogic();

		// broke
		compLog.thisMethodIsBroken();

		// works and sorts by the ranking attribute of each player
		compLog.thisMethodIsFixed();

		PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();

		PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();

		compLog.methodWithComparator(playerRankingComparator);

		compLog.methodWithComparator(playerAgeComparator);

		Comparator<ComparablePlayer> byRanking = Comparator.comparing(ComparablePlayer::getRanking);
		Comparator<ComparablePlayer> byAge = Comparator.comparing(ComparablePlayer::getAge);
		Comparator<ComparablePlayer> byName = Comparator.comparing(ComparablePlayer::getName);

		Comparator<ComparablePlayer> byRankingFull = (ComparablePlayer player1,
				ComparablePlayer player2) -> player1.getRanking() - player2.getRanking();

		System.out.println("------------------------Comparisons with Lambdas------------------------------");

		compLog.methodWithLambdas(byRankingFull);

		compLog.methodWithLambdas(byRanking);

		compLog.methodWithLambdas(byAge);

		compLog.methodWithLambdas(byName);

	}

}

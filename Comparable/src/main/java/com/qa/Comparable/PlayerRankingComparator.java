package com.qa.Comparable;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<ComparablePlayer> {

	@Override
	public int compare(ComparablePlayer o1, ComparablePlayer o2) {

		return (o1.getRanking() - o2.getRanking());
	}

}

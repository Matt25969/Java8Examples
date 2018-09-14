package com.qa.Comparable;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<ComparablePlayer> {

	@Override
	public int compare(ComparablePlayer o1, ComparablePlayer o2) {

		return (o1.getAge() - o2.getAge());
	}

}

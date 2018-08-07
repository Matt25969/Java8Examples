package com.qa.Hospital;

public class Ward {

	private final int maxCapacity;

	private int currentCapacity;

	private Ward(int capacity) {

		this.maxCapacity = capacity;
		this.setCurrentCapacity(0);

	}

	public static Ward createWard(int capacity) {
		return new Ward(capacity);
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

}

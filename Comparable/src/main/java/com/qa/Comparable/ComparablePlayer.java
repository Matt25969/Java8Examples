package com.qa.Comparable;

public class ComparablePlayer implements Comparable<ComparablePlayer> {

	private int ranking;
	private String name;
	private int age;

	public ComparablePlayer(int ranking, String name, int age) {
		super();
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(ComparablePlayer otherPlayer) {

		return (this.getRanking() - otherPlayer.getRanking());
	}

	@Override
	public String toString() {
		return "ComparablePlayer [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

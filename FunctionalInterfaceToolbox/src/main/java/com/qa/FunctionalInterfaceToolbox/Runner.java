package com.qa.FunctionalInterfaceToolbox;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {

	public static void main(String[] args) {

		Supplier<String> mySupp = () -> "Hi";

		System.out.println(mySupp.get());

		Consumer<String> myConsumer = s -> System.out.println(s.length());

		List<String> stringList = Arrays.asList("*", "**", "***", "****");

		stringList.stream().forEach(myConsumer);

		BiConsumer<String, String> myBiConsumer = (s, i) -> System.out.println(s + i);

		stringList.stream().collect(mySupp, myBiConsumer, myBiConsumer);

		Predicate<String> myPred = s -> s.equals("*");

		System.out.println(stringList.stream().anyMatch(myPred));

	}

}

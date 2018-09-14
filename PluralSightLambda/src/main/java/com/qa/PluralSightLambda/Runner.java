package com.qa.PluralSightLambda;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Using a class that extends the interface");
		System.out.println("-----------------------------------------------------------");

		JavaFileFilter JFF = new JavaFileFilter();

		File falseFile = new File("temp.txt");

		File trueFile = new File("Logic.java");

		System.out.println(JFF.accept(falseFile));

		System.out.println(JFF.accept(trueFile));

		System.out.println("-----------------------------------------------------------");
		System.out.println("Using listFiles");
		System.out.println("-----------------------------------------------------------");

		File dir = new File(
				"C:\\Users\\Admin\\Desktop\\Course Examples Master\\Java 8 Workspace\\PluralSightLambda\\src\\main\\java\\com\\qa\\PluralSightLambda");
		File[] javaFiles = dir.listFiles(JFF);

		List<File> javaList = Arrays.asList(javaFiles);

		javaList.stream().forEach(System.out::println);

		System.out.println("-----------------------------------------------------------");
		System.out.println("Second way to implement FileFilter, using an anomoyous class");
		System.out.println("-----------------------------------------------------------");

		FileFilter fileFilter = new FileFilter() {

			// on one hand more readable
			// more cluttered

			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};

		File dir2 = new File(
				"C:\\Users\\Admin\\Desktop\\Course Examples Master\\Java 8 Workspace\\PluralSightLambda\\src\\main\\java\\com\\qa\\PluralSightLambda");
		File[] javaFiles2 = dir2.listFiles(fileFilter);

		List<File> javaList2 = Arrays.asList(javaFiles2);

		javaList2.stream().forEach(System.out::println);

		System.out.println("-----------------------------------------------------------");
		System.out.println("Lamdba way to implement FileFilter");
		System.out.println("-----------------------------------------------------------");

		FileFilter lambdaFilter = (File file) -> file.getName().endsWith(".java");

		File dir3 = new File(
				"C:\\Users\\Admin\\Desktop\\Course Examples Master\\Java 8 Workspace\\PluralSightLambda\\src\\main\\java\\com\\qa\\PluralSightLambda");
		File[] javaFiles3 = dir3.listFiles(lambdaFilter);

		List<File> javaList3 = Arrays.asList(javaFiles3);

		javaList3.stream().forEach(System.out::println);

		System.out.println("-----------------------------------------------------------");
		System.out.println("MathOperation");
		System.out.println("-----------------------------------------------------------");

		MathOperation division = (a, b) -> a / b;

		List<Integer> myIntList = new ArrayList<Integer>();

		myIntList.add(12);
		myIntList.add(22);
		myIntList.add(36);
		myIntList.add(40);

		myIntList.stream().forEach(n -> System.out.println(division.operation(n, 2)));

		System.out.println("-----------------------------------------------------------");
		System.out.println("Runnable comparison");
		System.out.println("-----------------------------------------------------------");

		// this anomnyous class requires the new keyword to be used in order to execute
		// its function - more overheads

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 3; i++) {
					System.out.println("Hello world from thread [" + Thread.currentThread().getName() + "]");
				}

			}
		};

		// creating a lambda removes the overhead of having to create an object.

		Runnable runnableLambda = () -> {

			for (int i = 0; i < 3; i++) {
				System.out.println("Hello world from thread [" + Thread.currentThread().getName() + "]");
			}

		};

		Thread t = new Thread(runnable);

		Thread t1 = new Thread(runnableLambda);

		t.start();
		// t1.start();

		try {
			t.join();
			// t.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		t1.start();
		// t1.start();

		try {
			t1.join();
			// t.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("-----------------------------------------------------------");
		System.out.println("Comparator comparison");
		System.out.println("-----------------------------------------------------------");

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return Integer.compare(o1.length(), o2.length());

			}
		};

		List<String> tempList = Arrays.asList("+++", "++", "++++", "+");

		Collections.sort(tempList, comp);

		tempList.stream().forEach(System.out::println);

		// OR - with less overhead

		List<String> tempList2 = Arrays.asList("***", "********", "*", "****");

		Comparator<String> compLambda = (s1, s2) -> Integer.compare(s1.length(), s2.length());

		Collections.sort(tempList2, compLambda);

		tempList2.stream().forEach(System.out::println);

		System.out.println("-----------------------------------------------------------");
		System.out.println("Method references");
		System.out.println("-----------------------------------------------------------");

		Consumer<String> c = s -> System.out.println(s);

		Consumer<String> cMethodReference = System.out::println;

	}

}

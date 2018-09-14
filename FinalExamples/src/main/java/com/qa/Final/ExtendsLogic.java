package com.qa.Final;

public final class ExtendsLogic extends Logic {

	public int notFinalMethod(int a, int b) {

		return a + b + 10;

	}

	// cannot overide the final method from Logic

	// public final int finalMultMethod(int a, int b) {
	//
	// return a * b;
	//
	// }

	// cannot work as the ExtendsLogic class cannot be extended

	// public class TriesToExtendExtendsLogic extends ExtendsLogic {
	//
	// }

}

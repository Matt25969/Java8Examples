package Runner;

import WithInnerClasses.WithInner;
import WithLambdas.WithLambda;
import WithoutInnerClasses.WithoutInner;

public class Runner {

	public static void main(String[] args) {
		WithInner.start();

		System.out.println("----------------------------------------");

		WithoutInner.start();

		System.out.println("----------------------------------------");

		WithLambda.start();

	}

}

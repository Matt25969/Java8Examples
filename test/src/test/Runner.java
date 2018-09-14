package test;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print X = new Print();
		X.start();
		for (;;) {
			System.out.println("World");
		}
	}

}

class Print extends Thread {
	public void run() {
		for (;;) {
			System.out.println("Hello");
		}
	}

}

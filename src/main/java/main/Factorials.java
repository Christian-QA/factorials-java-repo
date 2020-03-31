package main;

public class Factorials {

	public static int factorialStarter(int num1) {

		int sum1 = 1;
		for (int i = 1; i <= num1; i++) {
			sum1 *= i;
		}
		return sum1;
	}

}

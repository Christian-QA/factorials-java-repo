package main;

public class Factorials {

	public static String factorialStarter(int num1) {

		int i = 1;
		while (true) {
			if (num1 < i) {
				return "NONE";
			} else if (num1 == i) {
				break;
			}
			num1 /= i;
			i++;
		}
		String result = Integer.toString(i) + "!";
		return result;
	}

}

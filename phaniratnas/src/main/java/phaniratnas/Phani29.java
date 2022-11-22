package phaniratnas;

import java.util.Scanner;

public class Phani29 {
	public static String getSumOfFactors(int n) {
		String result = " ";
		if (n < 0) {
			return " " + -1;
		} else if (n == 0) {
			return " " + -2;
		} else {
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {

				if (i == (n / i))
					result += i;
				else
					result += (i + n / i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = in.nextInt();
		System.out.println(getSumOfFactors(n));
	}

}

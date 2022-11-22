package phaniratnas;

import java.util.Scanner;

public class Phani24 {

	static String checkPrime(int n) {
		String result = " ";

		if (n <= 1) {
			return " " + -1;
		}
		for (int i = 2; i <= n / 2; i++) {
			if ((n % i) == 0)
				return " " + -2;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur no:");
		int n = sc.nextInt();
		System.out.println(checkPrime(n));

	}

}

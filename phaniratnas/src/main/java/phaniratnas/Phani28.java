package phaniratnas;

import java.util.Scanner;

public class Phani28 {
	public static String getFactors(int n) {
		String result = " ";
		if (n < 0) {
			return " " + -1;
		} else if (n == 0) {
			return " " + -2;
		} else {

			System.out.println("Factors of " + n + " are ");

			for (int i = 1; i <= n; i++) {
				if (n % i == 0)
					System.out.println(i + " ");
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = in.nextInt();
		System.out.println(getFactors(n));

	}

}

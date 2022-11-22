package phaniratnas;

import java.util.Scanner;

public class Phani30 {
	public static String getEvenNumbers(int n) {
		String result = " ";
		if (n < 0) {
			return " " + -1;
		} else if (n == 0) {
			return " " + -2;
		} else {
			if (n % 2 == 0)
				System.out.println(n + " is even");
			else
				System.out.println(n + " is odd");

		}
		return result;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = in.nextInt();
		System.out.println(getEvenNumbers(n));
	}

}

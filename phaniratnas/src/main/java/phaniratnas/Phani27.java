package phaniratnas;

import java.util.Scanner;

public class Phani27 {

	public static String getFactorial(int n) {
		String result = " ";
		if (n < 0) {
			return " " + -1;
		} else if (n == 0) {
			return " " + -2;
		} else {
			int i = 1, fact = 1;
			while (i <= n) {
				fact = fact * i;
				i++;
			}
			System.out.println("Factorial of the number: " + fact);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(getFactorial(n));

	}

}

package phaniratnas;

import java.util.Scanner;

public class Phani31 {
	public static String getSquare(int n) {
		String result = " ";
		int x = n % 10;
		if (x == 2 || x == 3 || x == 7 || x == 8) {
			return " " + -1;
		}
		for (int i = 0; i <= n / 2 + 1; i++) {
			if ((long) i * i == n) {
				return " " + -2;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		int n = in.nextInt();
		System.out.print("Is the said number perfect square? " + getSquare(n));

	}

}

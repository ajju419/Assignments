package phaniratnas;

import java.util.Scanner;

public class Phani26 {

	public static String checkArmStrong(int number) {
		String result = " ";
		if (number < 0) {
			return " " + -1;
		} else if (number == 0) {
			return " " + -2;
		} else {

			int check, rem, sum = 0;

			check = number;
			while (check != 0) {
				rem = check % 10;
				sum = sum + (rem * rem * rem);
				check = check / 10;
			}
			if (sum == number)
				System.out.println("Given number is an armstrong number.");
			else
				System.out.println("Given number is not an armstrong number.");
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be verified:");
		int number = sc.nextInt();
		System.out.println(checkArmStrong(number));

	}

}

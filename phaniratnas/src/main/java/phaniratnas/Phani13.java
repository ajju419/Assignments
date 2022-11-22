package phaniratnas;

import java.util.Scanner;

public class Phani13 {
	public static int numberone;
	public static int numbertwo;
	public static int numberthree;

	public int result;

	public int sumOfRoundedValues(int numberone, int numbertwo, int numberthree) {
		if (numberone <= 0 || numbertwo <= 0 || numberone <= 0) {
			result = -1;

		} else {
			int temp = ((numberone / 10 ) * 10);
			int tempone = ((numbertwo / 10 ) * 10);
			int temptwo = ((numberthree / 10 ) * 10);

			result = temp + tempone + temptwo;

		}

		return result;
	}

	public static void main(String[] args) {
         Scanner scannerobject= new Scanner(System.in);
         System.out.println("enther the value for numberone");
         numberone=scannerobject.nextInt();
         System.out.println("enter the value for numbertwo");
         numbertwo=scannerobject.nextInt();
         System.out.println("enter the value for numberthree");
         numberthree=scannerobject.nextInt();
         
         Phani13 objectone= new Phani13();
         System.out.println(objectone.sumOfRoundedValues(numberone, numbertwo, numberthree));
	}

}

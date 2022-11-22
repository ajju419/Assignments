package phaniratnas;

import java.util.Scanner;

public class Phani4 {
	
	public static int numberOne;
	static int result;
	
	public int isPalindrome(int numberOne){
		if(numberOne <= 0) {
			result=-1;
		}
		else if(numberOne > 999 && numberOne < 100) {
			result=-2;
		}
		else {
			int reversenumber=0;
            int remainder;
           int temp =numberOne;
            while (numberOne != 0) {
                remainder = numberOne % 10;
                reversenumber = reversenumber * 10 + remainder;
                numberOne /= 10;
              }
            if (temp == reversenumber) {
                System.out.println("The given number is Palindrome.");
              }
              else {
                System.out.println("the given number is not Palindrome.");
              }
			result=0;
		}
		
		
		return result;
	}
	

	public static void main(String[] args) {
	Scanner scannerObject= new Scanner(System.in);
	System.out.println("enter the value of the number");
	numberOne=scannerObject.nextInt();
	Phani4 objectone=new Phani4();
	System.out.println(objectone.isPalindrome(numberOne));

	}

}

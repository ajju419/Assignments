package phaniratnas;

import java.util.Scanner;

public class Phani2 {
	static int numberOne;
	int result;
	
	public int getDiffOfDigits(int numberOne) {
		int tenthdigit;
		int lastdigit;
		if(numberOne < 0) {
			result=-3;
		}
		else if(numberOne >99) {
			result=-2;
		}
		else if(numberOne > 0 && numberOne < 9) {
			result= -1;
		}
		else {
			tenthdigit = numberOne/10;
			
			lastdigit= numberOne % 10;
			
			result= tenthdigit-lastdigit;
			
			
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of numberOne");
		numberOne=sc.nextInt();
		Phani2 objectOne=new Phani2();
		System.out.println(objectOne.getDiffOfDigits(numberOne));
		

	}

}

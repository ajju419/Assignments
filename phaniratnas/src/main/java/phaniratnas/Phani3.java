package phaniratnas;

import java.util.Scanner;

public class Phani3 {
	static int numberOne;
	static int result;
	
	public int getNextMultipleOf100(int numberOne) {
		if(numberOne < 0) {
			result=-1;
		}
		else {
			int demo=numberOne/100;
			result=(demo + 1)*100; 
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scannerObject= new Scanner(System.in);
		System.out.println("enter the value which you required");
		numberOne=scannerObject.nextInt();
		Phani3 objectOne= new Phani3();
		System.out.println("required output is ::  " + objectOne.getNextMultipleOf100(numberOne));

	}

}

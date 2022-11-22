package phaniratnas;

import java.util.Scanner;

public class Phani10 {
	public static String result;
	public static int numberone;
	
	public String isEvenOrOdd(int numberone) {
		if(numberone <=0) {
			result="invalid input";
		}
		else{
			 if(numberone%2 == 0) {
					result ="Even";
				}
			 else{
				 result ="odd";
			 }
			
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scannerobject = new Scanner(System.in);
		System.out.println("enter the number which you want to enter");
		numberone=scannerobject.nextInt();
		Phani10 objectone= new Phani10();
		System.out.println(objectone.isEvenOrOdd(numberone));

	}

}

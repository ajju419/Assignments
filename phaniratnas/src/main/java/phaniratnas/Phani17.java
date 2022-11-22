package phaniratnas;

import java.util.Scanner;

public class Phani17 {
	public static int numberone;
	public static int numbertwo;
	public static String result;
	
	public String getNumbersInRange(int numberone, int numbertwo) {
		if(numberone <0 && numbertwo <0) {
			result="-1";
		}
		else if(numberone ==0 && numbertwo ==0) {
			result="-2";
		}
		else {
			if(numberone < numbertwo) {
			result=String.valueOf(numberone)+ " "+String.valueOf(numbertwo);
		}
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner scannerobject=new Scanner(System.in);
		System.out.println("enther the first value");
		numberone=scannerobject.nextInt();
		System.out.println("enter the second value");
		numbertwo=scannerobject.nextInt();
		Phani17 objectone= new Phani17();
		System.out.println(objectone.getNumbersInRange(numberone, numbertwo));
		
	
	}

}

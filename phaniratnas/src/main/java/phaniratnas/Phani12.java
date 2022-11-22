package phaniratnas;

import java.util.Scanner;

public class Phani12 {
	public static int numberone;
	public static int numbertwo;
	public static int numberthree;
	public static int result;
	
	public int sumOfMultiples(int numberone, int numbertwo, int numberthree) {
		if(numberone <=0 || numbertwo <=0 || numberthree <=0) {
			result=-1;
		}
		else {
			int temp=(numberone%10==0)?(numberone):((numberone/10+1) * 10);
			int tempone=(numbertwo%10==0)?(numbertwo):(((numbertwo/10)+1) * 10);
			int temptwo=(numberthree%10==0)?(numberthree):(((numberthree/10)+1) * 10);
			
			result= temp + tempone + temptwo;
		}
		
		
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the value for first number");
		numberone=scannerobject.nextInt();
	    System.out.println("enter the value for  second number");
	    numbertwo=scannerobject.nextInt();
	    System.out.println("enter the value for third number");
	    numberthree=scannerobject.nextInt();
	    Phani12 objectone= new Phani12();
	    System.out.println(objectone.sumOfMultiples(numberone, numbertwo, numberthree));

	}

}

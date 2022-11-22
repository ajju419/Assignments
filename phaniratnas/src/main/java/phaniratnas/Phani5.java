package phaniratnas;

import java.util.Scanner;

public class Phani5 {
	public static int result;
	public static int numberOne;

	public int isEven(int numberOne){
		if(numberOne%2 == 0) {
			result=1;
		}
		else {
			result=0;
		}
		
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the value which you want");
		numberOne=scannerobject.nextInt();
		Phani5 objectone=new Phani5();
		System.out.println(objectone.isEven(numberOne));
		
		

	}

}

package phaniratnas;

import java.util.Scanner;

public class Phani9 {
	public static int numberone;
	public static int result;
	
	public int findSign(int numberone){
		if(numberone > 0) {
			result=1;
		}
		else if(numberone < 0) {
			result=-1;
		}
		else {
			result=0;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the value of the number");
		numberone=scannerobject.nextInt();
		Phani9 objectone= new Phani9();
		System.out.println(objectone.findSign(numberone));
		
		

	}

}

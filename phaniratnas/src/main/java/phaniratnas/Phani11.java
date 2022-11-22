package phaniratnas;

import java.util.Scanner;

public class Phani11 {
	public static int numberone;
	public static int result;
	
	public int calculate(int numberone){
		if(numberone <=0) {
			result=-1;
		}
		else {
			if(numberone%2 ==0) {
				result= numberone * numberone;
			}
			else {
				result=numberone * numberone * numberone;
			}
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the number which you want");
		numberone=scannerobject.nextInt();
		Phani11 objectone= new Phani11();
		System.out.println(objectone.calculate(numberone));
		

	}

}

package phaniratnas;

import java.util.Scanner;

public class Phani7 {
	public static int leastnumber;
	public static int firstnumber;
	public static int secondnumber;
	
	public int getLeastNum(int firstnumber, int secondnumber){
		if(firstnumber <0 || secondnumber <0) {
			leastnumber=-1;
		}
		else if(firstnumber ==0 || secondnumber ==0) {
			leastnumber=-2;
		}
		else {
			if(firstnumber < secondnumber) {
				leastnumber= firstnumber;
			}
			else {
				leastnumber= secondnumber;
			}
		}
		
		
		
		return leastnumber;
		
	}
	

	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the first number");
		firstnumber=scannerobject.nextInt();
		System.out.println("enter the second number");
		secondnumber=scannerobject.nextInt();
		Phani7 objectone= new Phani7();
		System.out.println("the least number is : " + objectone.getLeastNum(firstnumber, secondnumber));

	}

}

package phaniratnas;

import java.util.Scanner;

public class Phani6 {
     public static int greatestnumber;
     public static int firstnumber;
     public static int secondnumber;
     
     public int getGreatest(int firstnumber, int secondnumber) {
    	 
    	 if(firstnumber <0 || secondnumber <0) {
    		 greatestnumber= -1;
    	 }
    	 else if(firstnumber ==0 || secondnumber==0) {
    		 greatestnumber= -2;
    	 }
    	 else{
    		 if(firstnumber > secondnumber) {
    			 greatestnumber=firstnumber;
    		 }
    		 else {
    			 greatestnumber=secondnumber;
    		 }
    	 }
    	 
    	 
    	 
    	 return greatestnumber;
     }
	
	
	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the first number");
		firstnumber=scannerobject.nextInt();
		System.out.println("enter the second number");
		secondnumber=scannerobject.nextInt();
		Phani6 objectone=new Phani6();
		System.out.println("the greatest number is " + objectone.getGreatest(firstnumber, secondnumber));	
		

	}

}

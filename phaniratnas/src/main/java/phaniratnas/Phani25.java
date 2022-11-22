package phaniratnas;

import java.util.Scanner;

public class Phani25 {
	public static  String checkPalindrome(int n) {
		 String result=" ";
		     if(n<0){
		    	 return " "+-1;
		     }else if(n==0){
		    	 return " "+-2;
		     }else{
	     int sum = 0, r;
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome");   
	}
return result;
}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	     System.out.print("Input a number: ");
	     int n = in.nextInt();
	     System.out.println(checkPalindrome(n));

	}

}

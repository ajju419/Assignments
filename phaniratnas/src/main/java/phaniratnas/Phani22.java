package phaniratnas;

import java.util.Scanner;

public class Phani22 {
	public static  String createBoxPattern(int num) {
		 String result=" ";
		     if(num<0){
		    	 return " "+-1;
		     }else if(num==0){
		    	 return " "+-2;
		     }else{
		   for(int i=0;i<num;i++)
		      {
		          
		          for(int j=0;j<=i;j++)
		          {
		            System.out.print("* ");
		          }
		          System.out.println();
		      }
		   
		     }
		   return result;
		 }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(createBoxPattern(num));
	}
	

}

package phaniratnas;

import java.util.Scanner;

public class Phani23 {
	 public static  String NumberPattern4(int rows) {
		 String result=" ";
		     if(rows<0){
		    	 return " "+-1;
		     }else if(rows==0){
		    	 return " "+-2;
		     }else{
 
        for (int i = 1; i <= rows; i++)
        {
            int num = i;
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num+" ");
 
                num = num+rows-j;
            }
 
            System.out.println();
        }
		     }
			return result;
        
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = sc.nextInt();
 
        System.out.println(NumberPattern4( rows));

	}

}

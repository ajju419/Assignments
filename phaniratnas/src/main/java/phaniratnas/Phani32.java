package phaniratnas;

import java.util.Scanner;

public class Phani32 {
	public String findTriangle(int firstnumber,int secondnumber,int thirdnumber){
		if(firstnumber==0&&secondnumber==0&&thirdnumber==0){
			return "-1";
		}
		else if(firstnumber<0&&secondnumber<0&&thirdnumber<0){
			return "-2";
		}
		else{ 
			if(firstnumber==secondnumber&&secondnumber==thirdnumber){
				return "Equilateral Triangle";
			}
			else if((firstnumber==secondnumber)||(secondnumber==thirdnumber)||(thirdnumber==firstnumber));
			return "Isosceles Triangle";
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstnumber");
		int firstnumber = sc.nextInt();
		System.out.println("Enter the secondnumber");
		int secondnumber=sc.nextInt();
		System.out.println("Enter the thirdnumber");
		int thirdnumber = sc.nextInt();
		
		
		
		Phani32 ft = new Phani32();
		System.out.println(ft.findTriangle(firstnumber,secondnumber,thirdnumber));

	}

}

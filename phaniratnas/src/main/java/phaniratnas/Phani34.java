package phaniratnas;

import java.util.Scanner;

public class Phani34 {
	
	public int PrimeNumbersSum(int firstnumber,int secondnumber){
		if(firstnumber<0&&secondnumber<0){
			return -1;
		}
			else if(firstnumber==0||secondnumber==0){
				return -2;
			}
			else if(firstnumber>secondnumber){
				return -3;
			}
			else{
				int sum=0;
				for(int i=firstnumber;i<=secondnumber;i++){
					int count=0;
					for(int j=1;j<=i;j++){
						if(i%j==0){
							count++;
						}
					}
					if(count<=2){
					   sum+=i;
					}
				}
				return sum;
			}
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the firstnumber");
		int firstnumber = sc.nextInt();
		System.out.println("enter the secondnumber");
		int secondnumber =sc.nextInt();
		
		Phani34 ps= new Phani34();
		System.out.println("Sum of Prime Numbers in the given Range"+ps.PrimeNumbersSum(firstnumber,secondnumber));

	}

}

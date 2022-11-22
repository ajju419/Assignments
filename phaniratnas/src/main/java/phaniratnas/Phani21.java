package phaniratnas;

import java.util.Scanner;

public class Phani21 {
	
	public static String createStarPattern(int rows){
		 String result = "";
	for (int i=rows; i>= 1 ; i--){

	for (int j = i; j < rows ; j++) {

	System.out.print(" " );

	}

	for (int k = 1; k <= (2*i -1) ;k++) {

	if( k==1 || i == rows || k==(2*i-1)) {

	System.out.print("*");

	}

	else {

	System.out.print(" ");

	}

	}

	System.out.println(" " );
	
}
	return result;
}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println(createStarPattern(rows));

	}

}

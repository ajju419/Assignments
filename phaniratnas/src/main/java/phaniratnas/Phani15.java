package phaniratnas;

import java.util.Scanner;

public class Phani15 {
	public static boolean valueone;
	public static boolean valuetwo;
	public static boolean valuethree;
	
	public static boolean result;
	
	public boolean countBoolean(boolean valueone, boolean valuetwo, boolean valuethree) {
		if(valueone==true && valuetwo== true && valuethree==true) {
			result=true;
		}
		else if(valueone==true && valuetwo==true && valuethree==false) {
			result=true;
		}
		else if(valueone==true && valuetwo==false && valuethree==false) {
			result=false;
		}
		else {
			result=false;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enter the first boolean value");
		valueone=scannerobject.nextBoolean();
		System.out.println("enter the second boolean value");
		valuetwo=scannerobject.nextBoolean();
		System.out.println("enter the third boolean value");
		valuethree=scannerobject.nextBoolean();
		Phani15 objectone= new Phani15();
		System.out.println(objectone.countBoolean(valueone, valuetwo, valuethree));
		
		

	}

}

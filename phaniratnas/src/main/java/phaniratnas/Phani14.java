package phaniratnas;

import java.util.Scanner;

public class Phani14 {
	public static int numberone;
	public static boolean booleanone;
	public static String result;

	public String ringAlarm(int numberone, boolean booleanone) {

		if ((numberone < 0 || numberone > 6) ) {
			result = "invalid inputs";
		}
		
		else if ((numberone >= 1 && numberone <= 5) && (booleanone == true)) {
			result = "10:00";
		} else if ((numberone >= 1 && numberone <= 5) && (booleanone == false)) {
			result = "07:00";
		} else if ((numberone == 0 || numberone == 6) && (booleanone == true)) {
			result = "off";
		} 
		else if ((numberone == 0 && numberone <= 6) && (booleanone == false)) {
			result = "10:00";
		}else {
			result="please give valid input";

		}

		return result;
	}

	public static void main(String[] args ){
		Scanner scannerobject= new Scanner(System.in);
		System.out.println("enther the numeric value");
		numberone=scannerobject.nextInt();
		System.out.println("enter the boolean value");
		try {
			booleanone=scannerobject.nextBoolean();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("invalid inputs");
		}
		Phani14 objectone= new Phani14();
		System.out.println(objectone.ringAlarm(numberone, booleanone));

	}

}

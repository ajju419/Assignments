package phaniratnas;

import java.util.Scanner;

public class Phani35 {
	
	public String getStringWeaver(String firststring,String secondstring){
		if(firststring==""||secondstring==""){
			return "-1";
		}
		else if(firststring.length()>secondstring.length()){
			return secondstring+firststring+secondstring;
		}
		else if(firststring.length()<secondstring.length()){
			return firststring+secondstring+firststring;
		}
		else{
			String result="";
			for(int i=0;i<firststring.length();i++){
				result+=firststring.charAt(i)+""+secondstring.charAt(i);
			}
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the firststring");
		String firststring=sc.next();
		System.out.println("enter the secondstring");
		String secondstring=sc.next();
		
		
		Phani35 sw= new Phani35();
		System.out.println(sw.getStringWeaver(firststring,secondstring));

	}

}

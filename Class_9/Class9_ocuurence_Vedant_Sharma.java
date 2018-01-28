package Class_9;

import java.util.Scanner;

public class Class9_ocuurence_Vedant_Sharma {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=new String(); 
		System.out.print("Enter the main String :");
		s=scan.nextLine();
		String f=new String();
		System.out.print("Enter the String to find:");
		f=scan.nextLine(); 
		boolean match=false;
		for(int a=0;a<s.length();a++) {
			if(match==false)
			match=s.regionMatches(0, f, a, a+s.length());
			else break;
		}
		System.out.println(match);
	}

}

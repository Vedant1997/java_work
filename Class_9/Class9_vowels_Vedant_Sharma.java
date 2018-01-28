package Class_9;

import java.util.Scanner;

public class Class9_vowels_Vedant_Sharma {

	public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			String s=new String();
			System.out.print("Enter a String :");
			s=scan.nextLine();
			
			s=s.replaceAll("a","\b");
			s=s.replaceAll("e","\b");
			s=s.replaceAll("i","\b");
			s=s.replaceAll("o","\b");
			s=s.replaceAll("u","\b");
			System.out.print("The string without vowels become :"+s);
	} 

}

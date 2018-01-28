package Class_9;

import java.util.Scanner;

public class Class9_reverse_string_Vedant_Sharma { 

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		String s=new String();
		System.out.print("Enter a String :");
		s=scan.nextLine();
		StringBuffer sb=new StringBuffer(s);
		System.out.print("The reverse of the string is : "+sb.reverse());
		
		
	}

}

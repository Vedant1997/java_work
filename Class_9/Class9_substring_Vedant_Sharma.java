package Class_9;

import java.util.Scanner;

public class Class9_substring_Vedant_Sharma {

	public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
		String s=new String();
		System.out.print("Enter a String :");
		s=scan.nextLine(); 
		
		for(int a=0;a<s.length();a++) {
			
			for(int b=a+1;b<=s.length()&&b>a;b++) {
                System.out.println(s.substring(a, b));
			}
			
		}
	}

}




//abcde
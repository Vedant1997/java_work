package Class_9;

import java.util.Scanner;

public class Class9_word_Vedant_Sharma {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=new String(); 
		System.out.print("Enter the main String :");
		s=scan.nextLine();
		int count=1;
		s=s.trim();
		for(int a=0;a<s.length()-1;a++) {
			
			if((s.charAt(a)==' ')&&(s.charAt(a+1)!=' ')) {
				count=count+1;
			}
		} 
		System.out.println("Number of words are :"+count);
	}

}

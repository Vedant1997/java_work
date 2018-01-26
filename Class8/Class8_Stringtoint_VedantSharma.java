package Class8;

import java.util.Scanner;

public class Class8_Stringtoint_VedantSharma {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a nummber :");
		String f=Scan.next();
		System.out.println("Enter another nummber :");
		String s=Scan.next();
		int i =Integer.valueOf(f);
		int j =Integer.valueOf(s);
		System.out.println("The max number is :"+Integer.max(i, j));
	}

}

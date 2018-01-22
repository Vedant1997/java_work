package class_6;

import java.util.Scanner;

public class Class6_PrintComplex_Vedant_Sharma {

	static double real_part;
	static double imaginary_part;
    static void Display(Class6_PrintComplex_Vedant_Sharma ob) {
		System.out.print(real_part+"+"+imaginary_part+"i");
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Class6_PrintComplex_Vedant_Sharma ob1 = new Class6_PrintComplex_Vedant_Sharma(); 
		System.out.println("Enter the length of your rectangle :");
		ob1.real_part=scan.nextDouble();
		System.out.println("Enter the breadth of your rectangle :");
		ob1.imaginary_part=scan.nextDouble();
		System.out.print("The area of your rectangle is :");
		Display(ob1);
	}

}

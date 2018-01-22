package class_6;

import java.util.Scanner;

public class Class6_Rectangle_Vedant_Sharma {
	static double length;
	static double breadth;
	static double Calculate_Area(double i,double j) { 
		double Area=length*breadth;
		return Area;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Class6_Rectangle_Vedant_Sharma ob1 = new Class6_Rectangle_Vedant_Sharma(); 
		System.out.println("Enter the length of your rectangle :");
		ob1.length=scan.nextDouble();
		System.out.println("Enter the breadth of your rectangle :");
		ob1.breadth=scan.nextDouble();
		System.out.println("The area of your rectangle is :"+Calculate_Area(ob1.length,ob1.breadth));
	}

}

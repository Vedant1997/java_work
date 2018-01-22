package class_6;

import java.util.Scanner;

public class Class6_ComplexNum_Vedant_Sharma {
	static Scanner scan =new Scanner(System.in);
	 int real_part;
	 int imaginary_part;
    static void Display(Class6_ComplexNum_Vedant_Sharma ob) {
		System.out.print(ob.real_part+"+"+ob.imaginary_part+"i");
	}
    Class6_ComplexNum_Vedant_Sharma(){
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Enter the real part :");
    	real_part=scan.nextInt();
    	System.out.println("Enter the imaginary part :");
    	imaginary_part=scan.nextInt();
    }
    static void plus(Class6_ComplexNum_Vedant_Sharma ob1,Class6_ComplexNum_Vedant_Sharma ob2) {
    	System.out.println("The sum is :"+(ob1.real_part+ob2.real_part)+"+("+(ob1.imaginary_part+ob2.imaginary_part)+"i)");
    	
    }
    Class6_ComplexNum_Vedant_Sharma multiply(Class6_ComplexNum_Vedant_Sharma ob1) {
    	
    	this.real_part= ob1.real_part*this.real_part-ob1.imaginary_part*this.imaginary_part;
    	this.imaginary_part= ob1.real_part*this.imaginary_part+ob1.imaginary_part*this.real_part;
    	System.out.println("The product is :"+this.real_part+"+("+this.imaginary_part+"i)");
    	return this;
    }
    
	public static void main(String[] args) {
		System.out.println("Enter the values for 1st complex number :");
		Class6_ComplexNum_Vedant_Sharma ob1 = new Class6_ComplexNum_Vedant_Sharma();
		System.out.println("Enter the values for 2nd complex number :");
		Class6_ComplexNum_Vedant_Sharma ob2 = new Class6_ComplexNum_Vedant_Sharma();
		System.out.println("Enter the following :\n1.To display 1st complex number\n2.To display 2nd complex number\n3.To find the sum\n4.To find the product");
		int var =scan.nextInt(); 
		switch(var) {
		case 1:Display(ob1);
		break;
		case 2:Display(ob2);
		break;
		case 3:plus(ob1,ob2);
		break;
		case 4:ob1.multiply(ob2);
		break;
		default:System.out.println("Please enter a suitable value");
		}
	}

}

package class_6;

import java.util.Scanner;

public class Class6_Second_largest_VedantSharma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an 10 elements :");
		int arr[]=new int[10];
		for(int a=0;a<10;a++) {
			arr[a]=scan.nextInt();
		}
		int max=arr[0];
		int smax=0;
		for(int a=1;a<10;a++) {
			if(arr[a]>max) {
				smax=max; 
				max=arr[a];
			}
		}
		if(smax==0) {
			smax=arr[1];
			for(int a=2;a<10;a++) {
				if(arr[a]>smax) {
					smax=arr[a];
				}
			}
		}
		System.out.println("The second largest number in this array is: "+smax);
	}

}

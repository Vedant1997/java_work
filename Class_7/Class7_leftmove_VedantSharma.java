package Class_7;

import java.util.Scanner;

public class Class7_leftmove_VedantSharma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want :");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter your elements :");
		for(int a=0;a<arr.length;a++) {
			arr[a]=scan.nextInt();
		}
		int first =arr[0];
		for(int a=1;a<arr.length;a++) {
			arr[a-1]=arr[a];
		}
		arr[arr.length-1]=first;
		
		for(int a=0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
	}

}

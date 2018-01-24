package Class_7;

import java.util.Scanner;

public class Class7_Arraypair_VedantSharma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want to enter :");
		int n=scan.nextInt();
		System.out.println("What should be the sum of pairs :");
		int sum=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter " +n+" elements :");
		for(int a=0;a<arr.length;a++) {
			arr[a]=scan.nextInt();
		}
		int count=0;
		for(int a=0;a<arr.length;a++) {
			for(int b=1;b<arr.length;b++) {
				if(arr[a]+arr[b]==sum) {
					count++;
					break;
				}
			}
		}
		System.out.println("Number of pairs having the sum "+sum+" :"+count/2);
	}

}

package Class_7;

import java.util.Scanner;

public class Class7_Subarray_VedantSharma {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How many elements do you want in your array :");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements :");
		for(int a=0;a<size;a++) {
			arr[a]=scan.nextInt();
		}
		int count=1;
		int arry[]=new int[size];
		int max=0;
		for(int a=0;a<size-1;a++) {
			if(arr[a]<arr[a+1]) {
				count=count+1;
				if(max<count) {
				max=count;
				}
			}
			if(arr[a]>arr[a+1]) {
				count=0;
				continue;
			}
			
		}
		System.out.print("The max sorted sub array is of length :"+max);
		
	}

}

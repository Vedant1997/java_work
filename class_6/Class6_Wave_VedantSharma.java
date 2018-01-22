package class_6;

import java.util.Scanner;

public class Class6_Wave_VedantSharma {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Eneter 10 elements :");
		int arr[]=new int[10];
		for(int a=0;a<10;a++) {
			arr[a]=scan.nextInt();
		}
		for(int a=0;a<10;a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		
		for(int a=0;a<10;a++) {
			for(int b=0;b<9;b++) {
				if(arr[b]>arr[b+1]) {
					int temp=arr[b]; 
					arr[b]=arr[b+1];
					arr[b+1]=temp;
				}
			}
		}
		for(int a=0;a<10;a++) {
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		for(int a=0;a<10;a=a+2) {
			int temp=arr[a];
			arr[a]=arr[a+1];
			arr[a+1]=temp;
		}
		for(int a=0;a<10;a++) {
			System.out.print(arr[a]+" "); 
		}
		
	}

}

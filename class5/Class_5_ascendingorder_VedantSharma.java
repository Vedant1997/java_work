package class5;

public class Class_5_ascendingorder_VedantSharma {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,0,0,1,0};
		int arry[]=new int[arr.length];
		int size=arr.length-1;
		for(int a=0;a<arr.length;a++) {
			if(arr[a]==1) {
				arry[size]=1;
				size=size-1;
			}
		}
		for(int a=0;a<arry.length;a++) {
		System.out.print(arry[a]+" ");
	}
	}

}
 

class Class_5_search_VedantSharma {
	public static int binary_search(int arry[],int l,int r,int x) {
		int mid=(l+r)/2;
		while(l<=r) {
			if(arry[mid]<x) {
				l=mid+1;
			}
			else if(arry[mid]==x) {
				System.out.print("Element is found at index "+mid);
				break;
			}
			else {
				r=mid-1;
			}
			mid=(l+r)/2;
		}
		if(l>r) {
			System.out.print("Element not found");
		}
		return 0;
	}
	public static void main(String[] args) {
		int i= Integer.parseInt(args[0]);
		int arr[]= {1,4,6,7,8,9,10};
		binary_search(arr,0,arr.length-1,i);

			
		}
}

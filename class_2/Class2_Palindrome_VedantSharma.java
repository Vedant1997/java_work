package class_2;

public class Class2_Palindrome_VedantSharma {

	public static void main(String[] args) {
		int sum=0,remainder;
		int N=15689; 
		int M=12321;
		int temp=N;
		while(temp>0) {
			remainder=temp%10; 
			sum=remainder+sum*10;
			temp=temp/10;
		} 
		if(N==sum) {
			System.out.println("N is a palindrome");
		}
		else {System.out.println("N is not a palindrome");}
		temp=M;
		sum=0;
		while(temp>0) {
			remainder=temp%10;
			sum=remainder+sum*10;
			temp=temp/10;
		}
		if(M==sum) {
			System.out.println("M is a palindrome");
		}
		else {System.out.println("M is not a palindrome");}
		
	}

}

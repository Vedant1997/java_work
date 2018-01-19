package class_2;

public class Class2_Reversenumber_VedantSharma {

	public static void main(String[] args) {
		int number=25698;
		int remainder;
		int reverse=0;
		int temp=number;
		while(temp>0) {
			remainder=temp%10;
			reverse=remainder+reverse*10;
			temp=temp/10;
		}
		System.out.println("The required reverse number is "+reverse);
	}

}

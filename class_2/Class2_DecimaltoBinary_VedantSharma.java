package class_2;

public class Class2_DecimaltoBinary_VedantSharma {

	public static void main(String[] args) {
		int number=80;
		int remainder;
		int reverse=0;
		String binary="";
		int temp=number;
		while(temp>0) {
			remainder=temp%2;
			binary=remainder+""+binary;
			temp=temp/2;
		}
		System.out.println("The required binary number is "+binary);
	}

}

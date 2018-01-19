package class_2;

public class Class2_binarytodecimal_VedantSharma {

	public static void main(String[] args) {
		int binary=1000;
		int remainder,temp;
		int multiplier=1,decimal=0;
		while(binary>0) {
			remainder=binary%10;
			temp=multiplier*remainder;
			multiplier=multiplier*2;
			decimal=decimal+temp;
			binary=binary/10;
		}
		System.out.print("Decimal number is :"+decimal);
	}

}

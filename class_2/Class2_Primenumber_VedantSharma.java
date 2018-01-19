package class_2;

public class Class2_Primenumber_VedantSharma {

	public static void main(String[] args) {
		int number=1254;
		int flag=0;
		int half=number/2;
		while(half>=2) {
			if(number%half==0) {
				System.out.println("The given number is not a prime");
				flag=1; 
				break;
			}
			half=half-1;
		}
		if(flag==0) {
			System.out.println("The given number is prime");
		}
	} 

}

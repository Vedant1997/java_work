package Class_7;

public class Class7_Static_Block_Vedant_Sharma {
	static int a=10;
	int b;
	static {
		a=20;
		System.out.println("Hello I am inside static block");
	}
	public static void main(String[] args) {
		System.out.println(Class7_Static_Block_Vedant_Sharma.a);
		Class7_Static_Block_Vedant_Sharma.a=78;
		System.out.println(Class7_Static_Block_Vedant_Sharma.a);
		
	}

}

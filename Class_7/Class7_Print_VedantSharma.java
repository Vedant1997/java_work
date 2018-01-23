package Class_7;

public class Class7_Print_VedantSharma {

	void print() {
		System.out.println("Hello");
	}
	void print(int n) {
		System.out.println("Hello "+n);
	}
	void print(float f) {
		System.out.println("Hello "+f);
	}
	public static void main(String[] args) {
		Class7_Print_VedantSharma ob=new Class7_Print_VedantSharma();
		System.out.println("Example showing method overloading :");
		ob.print();
		ob.print(8.6f);
		ob.print(8);
		
	}

} 

package class5;

public class Class_5_Pattern_VedantSharma {

	public static void main(String[] args) {
		int b,c;
		for(int a=6;a>0;a--) {
			c=a-1;
			for(b=c;b>0&&b<a;b--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}

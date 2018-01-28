package Class_9;

public class Class9_pattern_Vedant_Sharma {

	public static void main(String[] args) {
		String s=new String("abc");
		
		
		for(int a=0;a<s.length();a++) {
			
			for(int b=1;b<=s.length()&&b>a;b++) {
                System.out.println(s.substring(a, b));
			}
			
		}
	}

}

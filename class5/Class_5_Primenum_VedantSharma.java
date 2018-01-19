class Class_5_Primenum_VedantSharma {

	public static void main(String[] args) {
		int i= Integer.parseInt(args[0]);
		int number; 
		int flag=0;
		for(number=i;number>0;number--) { 
		int half=number/2;
		while(half>=2) {
			if(number%half==0) {
				flag=1; 
				break;
			}
			half=half-1;
		}
		if(flag==0) {
			System.out.println(number+" is prime"); 
		} 
		flag=0;  
		}
  }
}

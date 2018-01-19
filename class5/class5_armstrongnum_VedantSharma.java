package class5;

public class class5_armstrongnum_VedantSharma {

	public static void main(String[] args) {
		int i= Integer.parseInt(args[0]);
		int count,remainder,multiply,sum=0;
		int temp=i;
		for(count=0;temp>0;count++) {		//finding number of digits in the users input
			temp=temp/10;
		}
		
		temp=i;
		int digits=count;
		for(int a=0;count>0;a++) {			//finding the sum 
			remainder=temp%10; 
			multiply=remainder;
		
			for(int b=1;b<digits;b++) {   
				multiply=multiply*remainder;
			}            
			
			sum=sum+multiply;
			temp=temp/10;
			multiply=0;
			count=count-1;
			
		}
		if(sum==i) {
			System.out.println(i+" is an armstrong number");
		}
		else
			System.out.println(i+" is not an armstrong number");
		
	}

}

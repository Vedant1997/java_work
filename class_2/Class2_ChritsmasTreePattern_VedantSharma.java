package class_2;

public class Class2_ChritsmasTreePattern_VedantSharma {

	public static void main(String[] args) {
	/*
	 * 
	 * 			*
	 * 		   ***
	 * 		  *****	
	 * 		 *******
	 * 
	 * 
	 */    
		int column;
		int row=1;
		int space=3;
		while(row<=4) { 
			column=2*row-1; 
			space=4-row; 
			while(space>0) {
				System.out.print(" ");
				space=space-1; 
			}
			while(column>0) {
					System.out.print("*");
					column=column-1;		
			}
			System.out.println("");
			row=row+1;
		}
	}

}

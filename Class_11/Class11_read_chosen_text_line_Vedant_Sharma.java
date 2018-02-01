package Class_11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Class11_read_chosen_text_line_Vedant_Sharma {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\new\\Desktop\\Acadview\\text_file_with_multiple_address.txt");
		int current_char;
		FileReader in = null;
		Scanner scan =new Scanner(System.in); 
		System.out.println("Enter the number of the line you want to print :");
		int line=scan.nextInt();
		int count=1; 
		try { 
			in = new FileReader(file);
		  
			while((current_char=in.read())!=-1&&count<=line) {
				if(current_char==10) {
					count=count+1;
					 
				}	 
				if(count==line) {
					System.out.print((char)current_char);
				
				}
			} 
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}

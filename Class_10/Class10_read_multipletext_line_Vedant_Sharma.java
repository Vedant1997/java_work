package Class_10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Class10_read_multipletext_line_Vedant_Sharma {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\new\\Desktop\\Acadview\\text_file_with_multiple_address.txt");
		int current_char;
		FileReader in = null;
		
		try {
			in = new FileReader(file);
		  
			while((current_char=in.read())!=-1) {
				System.out.print((char)current_char);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
 
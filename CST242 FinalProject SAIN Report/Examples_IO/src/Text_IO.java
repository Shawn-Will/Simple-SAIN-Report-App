//write to file
//re-writes over old file
//FileWriter allows to write to same file multiple times

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Text_IO {
	public static void main(String[] args){
		
		PrintWriter pw = null;

		try {
			FileWriter fw = new FileWriter("data.txt", true);
			pw = new PrintWriter(fw);
		} catch (FileNotFoundException e) {
			
			System.out.println("File cannot be found.");
		} catch (IOException e) {
			
			System.out.println("File cannot be found.");
		}
		
		pw.println("Hello World");
		System.out.println("Done");
		
		pw.close();
	}
}

//read text file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Text_IO {
	public static void main(String[] args){
		
		Scanner read = null;
		
		File input = new File("data.txt");
		try {
			read = new Scanner(input);
		} catch (FileNotFoundException e) {
			
			System.out.println("File cant be found.");
		}
		
		while(read.hasNext()){
			String line = read.nextLine();
			System.out.println(line);
		}
		
		System.out.println("Done Reading");
	}
}

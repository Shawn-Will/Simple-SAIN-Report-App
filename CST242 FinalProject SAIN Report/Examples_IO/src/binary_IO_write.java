//write object to bin file

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class binary_IO_write {
	public static void main(String[] args) throws IOException{
		
		Student s1 = new Student("John Doe", 4.0);
		Student s2 = new Student("Jean Cat", 2.0);
		
		Student[] studentArray = new Student[2];
		studentArray[0] = s1;
		studentArray[1] = s2;

		FileOutputStream fos = new FileOutputStream("data.dat", true);
		ObjectOutputStream  oos= new ObjectOutputStream(fos);
		
		try {
			oos.writeObject(studentArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		oos.close();
		System.out.println("Done Writing Object.");
	}
}

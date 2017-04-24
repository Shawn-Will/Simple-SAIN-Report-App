import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class binary_IO_read {
	public static void main(String[] args) throws IOException, ClassNotFoundException{

		FileInputStream fis = new FileInputStream("data.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student[] results = null;
		results = ((Student[]) ois.readObject());
		ois.close();
	
		for(Student s : results){
			System.out.println(s);
		}
		
		System.out.println("Done reading");
	}
}

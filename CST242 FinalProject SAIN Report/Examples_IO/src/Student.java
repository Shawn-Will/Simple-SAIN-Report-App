import java.io.Serializable;

public class Student implements Serializable {
	public Student(String name, double gpa) {
		
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	private String name;
	private double gpa;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}

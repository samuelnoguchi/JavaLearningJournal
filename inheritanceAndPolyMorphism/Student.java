package inheritanceAndPolyMorphism;

public class Student extends Person {
	private int graduationYear;
	private double gpa;
	
	public Student(String firstName0, String lastName0, int graduationYear0, double gpa0){
		super(firstName0, lastName0);
		this.graduationYear = graduationYear0;
		this.gpa = gpa0;
	}
	
	public void print(){
		System.out.println("Student Details:");
		super.print();
		System.out.println("\t" + graduationYear);
		System.out.println("\t"+gpa);
	}
	
}
